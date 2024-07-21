package com.blueprintmate.repository;

import com.blueprintmate.model.entity.EntranceHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EntranceHallRepository extends JpaRepository<EntranceHall, Integer> {
    @Query("SELECT eh FROM EntranceHall eh WHERE eh.form.id = ?1")
    Optional<EntranceHall> findByFormId(int id);
}
