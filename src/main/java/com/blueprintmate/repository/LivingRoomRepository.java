package com.blueprintmate.repository;

import com.blueprintmate.model.entity.LivingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LivingRoomRepository extends JpaRepository<LivingRoom, Integer> {
    @Query("SELECT lr FROM LivingRoom lr WHERE lr.from.id = ?1")
    Optional<LivingRoom> findByFormId(int id);
}
