package com.blueprintmate.service;

import com.blueprintmate.model.entity.Authority;
import com.blueprintmate.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class AuthorityService {

    @Autowired
    private AuthorityRepository repository;

    public Authority findAuthorityByName(final String name) {
        return getOptionalEntity(repository.findByName(name));
    }
}
