package com.blueprintmate.repository;

import com.blueprintmate.model.entity.HomeOfficeSuite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface HomeOfficeSuiteRepository extends JpaRepository<HomeOfficeSuite, Integer> {
    @Query("SELECT hos FROM HomeOfficeSuite hos WHERE hos.form.id = ?1")
    Optional<HomeOfficeSuite> findByFormId(int id);
}
