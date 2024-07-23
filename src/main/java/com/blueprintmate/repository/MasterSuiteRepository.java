package com.blueprintmate.repository;

import com.blueprintmate.model.entity.MasterSuite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MasterSuiteRepository extends JpaRepository<MasterSuite, Integer> {
    @Query("SELECT ms FROM MasterSuite ms WHERE ms.form.id = ?1")
    Optional<MasterSuite> findByFormId(int id);
}
