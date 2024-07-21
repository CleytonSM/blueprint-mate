package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
    @Query("SELECT e FROM Experience e WHERE e.form.id = ?1")
    Optional<Experience> findByFormId(int id);
}
