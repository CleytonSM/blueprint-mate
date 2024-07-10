package com.blueprintmate.service;

import com.blueprintmate.config.UserAuthenticationProvider;
import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.LoginDTO;
import com.blueprintmate.model.dto.LoginResponseDTO;
import com.blueprintmate.model.dto.RegisterDTO;
import com.blueprintmate.model.entity.User;
import com.blueprintmate.repository.UserRepository;
import com.blueprintmate.security.JwtProvider;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.verifyIfEntityAlreadyExists;

@Service
public class LoginService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;
    @Autowired
    private AuthorityService authorityService;
    @Autowired
    private UserAuthenticationProvider userAuthenticationProvider;
    @Autowired
    private JwtProvider jwtProvider;

    @Transactional
    private User save(User user) {
        return repository.save(user);
    }

    public void registerUser(RegisterDTO registerDTO) {
        verifyIfEntityAlreadyExists(repository.findByEmail(registerDTO.getEmail()));

        User newUser = modelMapperHelper.convertRegisterDTOtoUser(registerDTO);
        newUser.setAuthority(authorityService.findAuthorityByName("ROLE_USER"));

        save(newUser);
    }

    public LoginResponseDTO loginUser(LoginDTO loginDTO) {
        Authentication authentication = userAuthenticationProvider
                .authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getEmail(), loginDTO.getPassword()));

        return new LoginResponseDTO(jwtProvider.createToken(authentication));
    }
}
