package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitchenRepository extends JpaRepository<Kitchen, Integer> {
}
