package org.example.enr.Controller;

import org.example.enr.Service.EmpDetailsViewService;
import org.example.enr.entity.EmpDetailsView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeInfoController {

    private final EmpDetailsViewService service;

    public EmployeeInfoController(EmpDetailsViewService service){
        this.service = service;
    }

    @GetMapping("/employeeInfo")
    public List<EmpDetailsView> getAllEmployeeInfo(){
        System.out.println("get all");
        return service.findAll();
    }
    @GetMapping("/employeeInfo/{id}")
    public Optional<EmpDetailsView> employeeInfo(@PathVariable int id){
        System.out.println("info called");
        return service.findById(id);
    }

    @GetMapping("/test")
    public String test(){
        return "tested";
    }
}
