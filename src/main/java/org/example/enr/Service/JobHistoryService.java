package org.example.enr.Service;

import jakarta.persistence.EntityManager;
import org.example.enr.entity.JobHistory;
import org.example.enr.repository.JobHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobHistoryService {
    private final JobHistoryRepository jobHistoryRepository;

    public JobHistoryService(JobHistoryRepository jobHistoryRepository){
        this.jobHistoryRepository = jobHistoryRepository;
    }

    public List<JobHistory> findAllByEmployeeId(Integer id) {
        return jobHistoryRepository.findByEmployeeId(id);
    }
}
