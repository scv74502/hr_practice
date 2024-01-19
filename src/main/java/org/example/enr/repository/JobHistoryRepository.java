package org.example.enr.repository;

import org.example.enr.entity.JobHistory;
import org.example.enr.entity.JobHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryId> {
    @Query("SELECT j FROM JobHistory j WHERE j.id.employeeId = :employeeId")
    List<JobHistory> findByEmployeeId(@Param("employeeId") Integer employeeId);
}
