package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Appliances;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppliancesRepository extends JpaRepository<Appliances, Integer> {
}
