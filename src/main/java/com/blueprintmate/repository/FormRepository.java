package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Form;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public interface FormRepository extends JpaRepository<Form, Integer> {
    @Query("SELECT f FROM Form f WHERE f.client.name = ?1")
    List<Form> findByClientNameAndDate(String clientName);
}
