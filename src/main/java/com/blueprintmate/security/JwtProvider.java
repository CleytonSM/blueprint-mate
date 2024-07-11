package com.blueprintmate.security;

import com.blueprintmate.config.UserAuthenticationProvider;
import com.blueprintmate.exception.InvalidJwtTokenException;
import com.blueprintmate.helper.OptionalHelper;
import com.blueprintmate.helper.SecretKeyHelper;
import com.blueprintmate.model.entity.Authority;
import com.blueprintmate.model.entity.User;
import com.blueprintmate.repository.UserRepository;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Component
@Eager
public class JwtProvider {

    @Autowired
    private SecretKeyHelper secretKeyHelper;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserAuthenticationProvider userAuthenticationProvider;

    public String createToken(Authentication authentication) {
        Date date = new Date();
        SecretKey key = secretKeyHelper.secretKeyBuilder();

        return Jwts.builder()
                .issuer("BluePrint Mate")
                .claims(claimsSetup(authentication))
                .subject("JWT Token")
                .issuedAt(date)
                .expiration(new Date(date.getTime() + 3600000L))
                .signWith(key)
                .compact();
    }

    public String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");

        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }

    private Map<String, String> claimsSetup(Authentication authentication) {
        User retrievedUser = (User) authentication.getPrincipal();
        Map<String, String> claims = new HashMap<>();

        claims.put("email", retrievedUser.getEmail());
        claims.put("authority", retrievedUser.getAuthority().getName());

        return claims;
    }

    public boolean validateToken(String token) {
        SecretKey secretKey = secretKeyHelper.secretKeyBuilder();

        try {
            Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            throw new InvalidJwtTokenException(e.getMessage());
        }
    }

    public Authentication getAuthentication(String token) {
        User user = getOptionalEntity(userRepository.findByEmail(getUserEmail(token)));

        return new UsernamePasswordAuthenticationToken(user, "",
                userAuthenticationProvider.grantedAuthorities(user.getAuthority()));
    }


    private String getUserEmail(String token) {
        SecretKey secretKey = secretKeyHelper.secretKeyBuilder();

        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token)
                .getPayload().get("email", String.class);
    }

    private String getRole(String token) {
        SecretKey secretKey = secretKeyHelper.secretKeyBuilder();

        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token)
                .getPayload().get("authority", String.class);
    }
}
