package org.example.enr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @Column(columnDefinition = "BIGINT", name = "department_id", nullable = false)
    private Integer id;

    @Column(name = "department_name", nullable = false, length = 30)
    private String departmentName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Locations location;

}