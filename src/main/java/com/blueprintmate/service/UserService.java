package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.helper.OptionalHelper;
import com.blueprintmate.model.dto.RegisterDTO;
import com.blueprintmate.model.entity.Authority;
import com.blueprintmate.model.entity.User;
import com.blueprintmate.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;
import static com.blueprintmate.helper.OptionalHelper.verifyIfEntityAlreadyExists;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;
    @Autowired
    private AuthorityService authorityService;

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
}
