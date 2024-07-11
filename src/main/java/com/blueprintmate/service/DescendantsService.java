package com.blueprintmate.service;

import com.blueprintmate.model.dto.ClientCreateDTO;
import com.blueprintmate.model.entity.Client;
import com.blueprintmate.model.entity.Descendants;
import com.blueprintmate.repository.DescendantsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class DescendantsService {

    @Autowired
    private DescendantsRepository repository;

    @Transactional
    private Descendants save(Descendants descendants) {
        return repository.save(descendants);
    }

    public void createDescendants(ClientCreateDTO clientCreateDTO, Client client) {
        clientCreateDTO.getDescendantsList().forEach(descendantsInfo -> save(new Descendants(client,
                descendantsInfo.getName(), descendantsInfo.getAge(), Timestamp.valueOf(LocalDateTime.now()))));
    }
}
