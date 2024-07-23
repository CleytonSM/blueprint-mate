package com.blueprintmate.repository;

import com.blueprintmate.model.entity.NecessaryAppliancesInLaundry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NecessaryAppliancesInLaundryRepository extends JpaRepository<NecessaryAppliancesInLaundry, Integer> {
    @Query("SELECT nail FROM NecessaryAppliancesInLaundry nail WHERE nail.laundry.id = ?1")
    List<NecessaryAppliancesInLaundry> findAllByLaundryId(int id);
}
