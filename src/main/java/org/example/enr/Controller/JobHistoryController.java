package org.example.enr.Controller;

import org.example.enr.Service.JobHistoryService;
import org.example.enr.entity.JobHistory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobHistoryController {
    private final JobHistoryService jobHistoryService;

    public JobHistoryController(JobHistoryService jobHistoryService){
        this.jobHistoryService = jobHistoryService;
    }

    @GetMapping("history/{id}")
    public List<JobHistory> jobHistories(@PathVariable Integer id){
        return jobHistoryService.findAllByEmployeeId(id);
    }
}
