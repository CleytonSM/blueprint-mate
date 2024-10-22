package com.blueprintmate.repository;

import com.blueprintmate.model.entity.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Query("SELECT c FROM Client c WHERE c.user.id = ?1")
    Optional<Client> findByUserId(int id);
    Optional<Client> findByName(String name);
}
