package com.blueprintmate.repository;

import com.blueprintmate.model.entity.NewAppliancesInKitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewAppliancesInKitchenRepository extends JpaRepository<NewAppliancesInKitchen, Integer> {
    @Query("SELECT naik FROM NewAppliancesInKitchen naik WHERE naik.kitchen.id = ?1")
    List<NewAppliancesInKitchen> findAllByKitchenId(int id);
}
