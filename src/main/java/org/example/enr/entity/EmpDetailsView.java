package org.example.enr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@ToString
@Table(name = "emp_details_view")
public class EmpDetailsView {
    @Id
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @Column(name = "job_id", nullable = false, length = 10)
    private String jobId;

    @Column(name = "manager_id")
    private Integer managerId;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "location_id")
    private Integer locationId;

    @Column(columnDefinition = "char", name = "country_id", nullable = false, length = 2)
    private String countryId;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;

    @Column(name = "salary", nullable = false, precision = 8, scale = 2)
    private BigDecimal salary;

    @Column(name = "commission_pct", precision = 2, scale = 2)
    private BigDecimal commissionPct;

    @Column(name = "department_name", nullable = false, length = 30)
    private String departmentName;

    @Column(name = "job_title", nullable = false, length = 35)
    private String jobTitle;

    @Column(name = "city", nullable = false, length = 30)
    private String city;

    @Column(name = "state_province", length = 25)
    private String stateProvince;

    @Column(name = "country_name", length = 40)
    private String countryName;

    @Column(name = "region_name", length = 25)
    private String regionName;

}