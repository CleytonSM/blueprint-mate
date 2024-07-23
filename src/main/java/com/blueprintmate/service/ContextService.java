package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.ContextCreateDTO;
import com.blueprintmate.model.dto.ContextUpdateDTO;
import com.blueprintmate.model.entity.Context;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.repository.ContextRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class ContextService {
    @Autowired
    private ContextRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;


    public Context setUpContext(ContextCreateDTO contextCreate) {
        return modelMapperHelper.convertContextCreateDTOToContext(contextCreate);
    }

    public void createContext(Context newContext, Form form) {
        newContext.setForm(form);

        save(newContext);
    }

    public void updateContext(Context retrievedContext, Form form) {
        retrievedContext.setForm(form);

        save(retrievedContext);
    }

    @Transactional
    private Context save(Context newContext) {
        return repository.save(newContext);
    }

    public Context findContextByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }

    public Context setUpContextForUpdate(Context retrievedContext, ContextUpdateDTO contextUpdateDTO) {
        return modelMapperHelper.convertContextUpdateDTOToContext(retrievedContext, contextUpdateDTO);
    }
}
