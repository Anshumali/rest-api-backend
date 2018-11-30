package com.banana.backend.repo;

import com.banana.backend.domain.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
    @Override
    Optional<Shipwreck> findById(Long aLong);
}
