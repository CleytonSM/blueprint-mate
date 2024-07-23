package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Bathroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BathroomRepository extends JpaRepository<Bathroom, Integer> {
    @Query("SELECT b FROM Bathroom b WHERE b.form.id = ?1")
    Optional<Bathroom> findByFormId(int id);
}
