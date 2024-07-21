package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Context;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ContextRepository extends JpaRepository<Context, Integer> {
    @Query("SELECT c FROM Context c WHERE c.form.id = ?1")
    Optional<Context> findByFormId(int id);
}
