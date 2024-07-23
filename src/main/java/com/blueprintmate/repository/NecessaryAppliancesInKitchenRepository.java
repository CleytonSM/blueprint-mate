package com.blueprintmate.repository;

import com.blueprintmate.model.entity.NecessaryAppliancesInKitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NecessaryAppliancesInKitchenRepository extends JpaRepository<NecessaryAppliancesInKitchen, Integer> {
    @Query("SELECT naik FROM NecessaryAppliancesInKitchen naik WHERE naik.kitchen.id = ?1")
    List<NecessaryAppliancesInKitchen> findAllByKitchenId(int id);
}
