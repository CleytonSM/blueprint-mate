package com.blueprintmate.repository;

import com.blueprintmate.model.entity.GuestsSuite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface GuestsSuiteRepository extends JpaRepository<GuestsSuite, Integer> {
    @Query("SELECT gs FROM GuestsSuite gs WHERE gs.form.id = ?1")
    Optional<GuestsSuite> findByFormId(int id);
}
