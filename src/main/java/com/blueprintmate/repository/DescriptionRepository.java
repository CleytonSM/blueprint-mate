package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescriptionRepository extends JpaRepository<Description, Integer> {
}
