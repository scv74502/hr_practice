package org.example.enr.Service;

import org.example.enr.Dto.EmpDetailsViewDto;
import org.example.enr.entity.EmpDetailsView;
import org.example.enr.repository.LocationsRepository;
import org.example.enr.repository.CountryRepository;
import org.example.enr.repository.DepartmentRepository;
import org.example.enr.repository.EmpDetailsViewRepository;
import org.example.enr.repository.EmployeesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpDetailsViewService {
    private final EmpDetailsViewRepository empDetailsViewRepository;
    private final EmployeesRepository employeesRepository;

    private final DepartmentRepository departmentRepository;
    private final CountryRepository countryRepository;
    private final LocationsRepository locationsRepository;

    public EmpDetailsViewService(EmpDetailsViewRepository empDetailsViewRepository,
                                 EmployeesRepository employeesRepository,
                                 DepartmentRepository departmentRepository,
                                 CountryRepository countryRepository,
                                 LocationsRepository locationsRepository){
        this.empDetailsViewRepository = empDetailsViewRepository;
        this.employeesRepository = employeesRepository;
        this.departmentRepository = departmentRepository;
        this.countryRepository = countryRepository;
        this.locationsRepository = locationsRepository;
    }

    public List<EmpDetailsView> findAll(){
        return empDetailsViewRepository.findAll();
    }

    public Optional<EmpDetailsView> findById(Integer id){
        Optional<EmpDetailsView> result = empDetailsViewRepository.findById(id);
//        System.out.println(result.toString());
//        System.out.println("4343");
//        if(result.isPresent()){
//            Integer lId = result.get().getLocationId();
//            Integer mId = result.get().getManagerId();
//            String jId = result.get().getJobId();
//            EmpDetailsViewDto res = EmpDetailsViewDto.builder()
//                    .employeeId(result.get().getEmployeeId())
//                    .city(result.get().getCity())
//                    .jobId()
//                    .commissionPct(result.get().getCommissionPct())
//                    .countryId(result.get().getCountryId())
//                    .departmentId(result.get().getDepartmentId())
//                    .departmentName(result.get().getDepartmentName())
//                    .firstName(result.get().getFirstName())
//                    .lastName(result.get().getLastName())
//                    .locationName(locationsRepository.findById(result.get().getLocationId()).get().getCity())
//                    .jobTitle(result.get().getJobTitle())
//                    .locationId()
//                    .managerId()
//                    .stateProvince(result.get().getStateProvince())
//                    .salary(result.get().getSalary())
//                    .managerName(employeesRepository.findById(result.get().getManagerId()).get().getFirstName()
//                            + " " +
//                            employeesRepository.findById(result.get().getManagerId()).get().getLastName())
//                    .jobTitle(result.get().getJobTitle())
//                    .build();
//            System.out.println(res.toString());
//        }
//        if(result.isPresent()){
//            Integer managerId = result.get().getManagerId();
//            String managerName = null;
//            if(managerId == null){
//                managerId = 99999999;
//                managerName = "Not Found";
//            }
//
//            else{
//                managerName = employeesRepository.findById(result.get().getManagerId()).get().getFirstName() +
//                        " " + employeesRepository.findById(result.get().getManagerId()).get().getLastName();
//            }
//            EmpDetailsViewDto empDetailsViewDto = new EmpDetailsViewDto(
//                    result.get().getEmployeeId(),
//                    result.get().getJobId(),
//                    managerId,
//                    managerName,
//                    result.get().getDepartmentId(),
//                    result.get().getDepartmentName(),
//                    result.get().getLocationId(),
//                    locationsRepository.findById(result.get().getLocationId()),
//                    result.get().getCountryId(),
//                    result.get().getFirstName(),
//                    result.get().getLastName(),
//                    result.get().getSalary(),
//                    result.get().getCommissionPct(),
//                    result.get().getJobTitle(),
//                    result.get().getCity(),
//                    result.get().getStateProvince()
//            );
//            return empDetailsViewDto;
//        }
//        return null;
        return empDetailsViewRepository.findById(id);
    }


}
