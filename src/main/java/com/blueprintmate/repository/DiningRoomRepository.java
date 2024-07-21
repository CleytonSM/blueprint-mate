package com.blueprintmate.repository;

import com.blueprintmate.model.entity.DiningRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DiningRoomRepository extends JpaRepository<DiningRoom, Integer> {
    @Query("SELECT dr FROM DiningRoom dr WHERE dr.form.id = ?1")
    Optional<DiningRoom> findByFormId(int id);
}
