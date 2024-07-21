package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface KitchenRepository extends JpaRepository<Kitchen, Integer> {
    @Query("SELECT k FROM Kitchen k WHERE k.form.id = ?1")
    Optional<Kitchen> findByFormId(int id);
}
