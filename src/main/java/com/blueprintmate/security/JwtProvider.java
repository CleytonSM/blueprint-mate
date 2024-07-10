package com.blueprintmate.security;

import com.blueprintmate.helper.SecretKeyHelper;
import com.blueprintmate.model.entity.User;
import com.blueprintmate.repository.UserRepository;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtProvider {

    @Autowired
    private SecretKeyHelper secretKeyHelper;

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

    private Map<String, String> claimsSetup(Authentication authentication) {
        User retrievedUser = (User) authentication.getPrincipal();
        Map<String, String> claims = new HashMap<>();

        claims.put("email", retrievedUser.getEmail());
        claims.put("authority", retrievedUser.getAuthority().getName());

        return claims;
    }
}
