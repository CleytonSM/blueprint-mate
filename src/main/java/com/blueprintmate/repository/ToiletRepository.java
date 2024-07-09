package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToiletRepository extends JpaRepository<Toilet, Integer> {
}
