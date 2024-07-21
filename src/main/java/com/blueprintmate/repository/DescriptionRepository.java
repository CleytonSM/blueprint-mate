package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DescriptionRepository extends JpaRepository<Description, Integer> {
    @Query("SELECT d FROM Description d WHERE d.form.id = ?1")
    Optional<Description> findByFormId(int id);
}
