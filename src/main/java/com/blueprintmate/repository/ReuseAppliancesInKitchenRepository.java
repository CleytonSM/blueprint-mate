package com.blueprintmate.repository;

import com.blueprintmate.model.entity.ReuseAppliancesInKitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReuseAppliancesInKitchenRepository extends JpaRepository<ReuseAppliancesInKitchen, Integer> {
    @Query("SELECT raik FROM ReuseAppliancesInKitchen raik WHERE raik.kitchen.id = ?1")
    List<ReuseAppliancesInKitchen> findAllByKitchenId(int id);
}
