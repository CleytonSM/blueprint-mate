package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Bathroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BathroomRepository extends JpaRepository<Bathroom, Integer> {
}
