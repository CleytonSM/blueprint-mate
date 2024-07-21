package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Laundry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LaundryRepository extends JpaRepository<Laundry, Integer> {
    @Query("SELECT l FROM Laundry l WHERE l.form.id = ?1")
    Optional<Laundry> findByFormId(int id);
}
