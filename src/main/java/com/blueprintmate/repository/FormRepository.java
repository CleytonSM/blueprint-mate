package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Form;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FormRepository extends JpaRepository<Form, Integer> {
    @Query("SELECT f FROM Form f WHERE f.client.name = ?1")
    List<Form> findByClientName(String clientName);
    @Modifying
    @Transactional
    @Query("DELETE FROM Form f WHERE f.client.id = ?1 AND f.id = ?2")
    void deleteByClientAndFormId(int clientId, int formId);
}
