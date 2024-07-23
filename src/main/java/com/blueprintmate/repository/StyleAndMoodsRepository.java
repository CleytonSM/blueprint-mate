package com.blueprintmate.repository;

import com.blueprintmate.model.entity.StyleAndMoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StyleAndMoodsRepository extends JpaRepository<StyleAndMoods, Integer> {
    @Query("SELECT sm FROM StyleAndMoods sm WHERE sm.form.id = ?1")
    Optional<StyleAndMoods> findByFormId(int id);
}
