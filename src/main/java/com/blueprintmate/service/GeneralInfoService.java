package com.blueprintmate.service;

import com.blueprintmate.helper.ModelMapperHelper;
import com.blueprintmate.model.dto.GeneralInfoCreateDTO;
import com.blueprintmate.model.dto.GeneralInfoUpdateDTO;
import com.blueprintmate.model.entity.Form;
import com.blueprintmate.model.entity.GeneralInfo;
import com.blueprintmate.repository.GeneralInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.blueprintmate.helper.OptionalHelper.getOptionalEntity;

@Service
public class GeneralInfoService {
    @Autowired
    private GeneralInfoRepository repository;
    @Autowired
    private ModelMapperHelper modelMapperHelper;

    public GeneralInfo setUpGeneralInfo(GeneralInfoCreateDTO generalInfo) {
        return modelMapperHelper.convertGeneralInfoCreateDTOToGeneralInfo(generalInfo);
    }

    public void createGeneralInfo(GeneralInfo newGeneralInfo, Form form) {
        newGeneralInfo.setForm(form);

        save(newGeneralInfo);
    }


    public void updateGeneralInfo(GeneralInfo retrievedGeneralInfo, Form form) {
        retrievedGeneralInfo.setForm(form);

        save(retrievedGeneralInfo);
    }

    private GeneralInfo save(GeneralInfo newGeneralInfo) {
        return repository.save(newGeneralInfo);
    }

    public GeneralInfo findGeneralInfoByForm(Form form) {
        return getOptionalEntity(repository.findByFormId(form.getId()));
    }

    public GeneralInfo setUpGeneralInfoForUpdate(GeneralInfo retrievedGeneralInfo,
                                                 GeneralInfoUpdateDTO generalInfoUpdateDTO) {
        return modelMapperHelper.convertGeneralInfoUpdateDTOToGeneralInfo(retrievedGeneralInfo, generalInfoUpdateDTO);
    }
}
