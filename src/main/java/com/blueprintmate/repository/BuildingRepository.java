package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Building;
import com.blueprintmate.model.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BuildingRepository extends JpaRepository<Building, Integer> {
    @Query("SELECT b FROM Building b WHERE b.form.id = ?1")
    Optional<Building> findByFormId(int id);
}
