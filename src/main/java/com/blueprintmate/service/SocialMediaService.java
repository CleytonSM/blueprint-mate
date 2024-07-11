package com.blueprintmate.service;

import com.blueprintmate.model.dto.ClientCreateDTO;
import com.blueprintmate.model.entity.Client;
import com.blueprintmate.model.entity.SocialMedia;
import com.blueprintmate.repository.SocialMediaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class SocialMediaService {

    @Autowired
    private SocialMediaRepository repository;

    public void createSocialMedia(ClientCreateDTO clientCreateDTO, Client client) {
        clientCreateDTO.getSocialMediaList().forEach(socialMedia -> save(new SocialMedia(socialMedia.getName(),
                client, Timestamp.valueOf(LocalDateTime.now()))));
    }

    @Transactional
    private SocialMedia save(SocialMedia socialMedia) {
        return repository.save(socialMedia);
    }

}
