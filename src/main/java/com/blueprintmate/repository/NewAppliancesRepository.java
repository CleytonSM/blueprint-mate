package com.blueprintmate.repository;

import com.blueprintmate.model.entity.NewAppliances;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewAppliancesRepository extends JpaRepository<NewAppliances, Integer> {
}
