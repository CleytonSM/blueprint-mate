package com.blueprintmate.repository;

import com.blueprintmate.model.entity.DescendantsSuite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DescendantsSuiteRepository extends JpaRepository<DescendantsSuite, Integer> {
    @Query("SELECT ds FROM DescendantsSuite ds WHERE ds.form.id = ?1")
    Optional<DescendantsSuite> findByFormId(int id);
}
