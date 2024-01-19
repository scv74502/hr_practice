package org.example.enr.repository;

import org.example.enr.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationsRepository extends JpaRepository<Locations, Integer> {
}