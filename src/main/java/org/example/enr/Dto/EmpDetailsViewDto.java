package org.example.enr.Dto;

import lombok.*;
import org.example.enr.entity.Locations;

import java.math.BigDecimal;
import java.util.Optional;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EmpDetailsViewDto {
    Integer employeeId;
    String jobId;
    Integer managerId;
    String managerName;
    Integer departmentId;
    String departmentName;
    Integer locationId;
    String locationName;
    String countryId;
    String firstName;
    String lastName;
    BigDecimal salary;
    BigDecimal commissionPct;
    String jobTitle;
    String city;
    String stateProvince;

    public EmpDetailsViewDto(Integer employeeId, String jobId, Integer managerId, String managerName, Integer departmentId, String departmentName, Integer locationId, Optional<Locations> byId, String countryId, String firstName, String lastName, BigDecimal salary, BigDecimal commissionPct, String jobTitle, String city, String stateProvince) {
    }
}