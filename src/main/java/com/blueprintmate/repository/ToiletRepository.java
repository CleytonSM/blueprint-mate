package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ToiletRepository extends JpaRepository<Toilet, Integer> {
    @Query("SELECT t FROM Toilet t WHERE t.form.id = ?1")
    Optional<Toilet> findByFormId(int id);
}
