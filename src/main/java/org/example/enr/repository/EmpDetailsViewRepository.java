package org.example.enr.repository;

import org.example.enr.entity.EmpDetailsView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDetailsViewRepository extends JpaRepository<EmpDetailsView, Integer> {
}
