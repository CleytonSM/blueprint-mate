package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.helper.PageHelper;
import com.blueprintmate.model.dto.ClientCreateDTO;
import com.blueprintmate.model.dto.ClientResponseDTO;
import com.blueprintmate.model.dto.PageFilterDTO;
import com.blueprintmate.model.dto.PageResponseDTO;
import com.blueprintmate.model.entity.Client;
import com.blueprintmate.model.entity.User;
import com.blueprintmate.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;
import static com.blueprintmate.helper.OptionalHelper.verifyIfEntityAlreadyExists;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;
    @Autowired
    private SocialMediaService socialMediaService;
    @Autowired
    private DescendantsService descendantsService;

    public void createClient(ClientCreateDTO clientCreateDTO) {
        User authenticatedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        verifyIfEntityAlreadyExists(repository.findByUserId(authenticatedUser.getId()));

        Client newClient = modelMapperHelper.convertClientCreateDTOToClient(clientCreateDTO);
        newClient.setUser(authenticatedUser);

        save(newClient);

        if(clientCreateDTO.getSocialMediaList() != null && !clientCreateDTO.getSocialMediaList().isEmpty()) {
            socialMediaService.createSocialMedia(clientCreateDTO, newClient);
        }
        if(clientCreateDTO.getDescendantsList() != null && !clientCreateDTO.getDescendantsList().isEmpty()) {
            descendantsService.createDescendants(clientCreateDTO, newClient);
        }
    }

    @Transactional
    private Client save(Client client) {
        return repository.save(client);
    }

    public Client findClientByUserId(int id) {
        return getOptionalEntity(repository.findByUserId(id));
    }

    public Client findClientByName(String name) {
        return getOptionalEntity(repository.findByName(name));
    }

    public ClientResponseDTO getClientByName(String name) {
        Client retrievedClient = getOptionalEntity(repository.findByName(name));

        return modelMapperHelper.convertClientToClientResponseDTO(retrievedClient);
    }

    public PageResponseDTO<ClientResponseDTO> findAllByPagination(PageFilterDTO pageFilterDTO) {
        Page<Client> page = repository.findAll(PageHelper.setUpPageable(pageFilterDTO));
        List<ClientResponseDTO> clientResponseDTOList= modelMapperHelper.
                convertClientListToClientResponseDTOList(page.getContent());

        return PageHelper.setUpPageResponse(page.getNumber(), page.getSize(), clientResponseDTOList);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
