package com.blueprintmate.repository;

import com.blueprintmate.model.entity.GeneralInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface GeneralInfoRepository extends JpaRepository<GeneralInfo, Integer> {
    @Query("SELECT gi FROM GeneralInfo gi WHERE gi.form.id = ?1")
    Optional<GeneralInfo> findByFormId(int id);
}
