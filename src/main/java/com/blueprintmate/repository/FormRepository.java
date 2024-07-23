package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FormRepository extends JpaRepository<Form, Integer> {
    @Query("SELECT f FROM Form f WHERE f.client.name = ?1")
    List<Form> findByClientName(String clientName);
}
