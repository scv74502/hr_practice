package org.example.enr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class JobHistoryId implements Serializable {
    private static final long serialVersionUID = -2916933196891061367L;
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @Column(name = "job_id", nullable = false, length = 10)
    private String jobId;

    @Column(name = "department_id", nullable = false)
    private Integer departmentId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JobHistoryId entity = (JobHistoryId) o;
        return Objects.equals(this.jobId, entity.jobId) &&
                Objects.equals(this.departmentId, entity.departmentId) &&
                Objects.equals(this.employeeId, entity.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, departmentId, employeeId);
    }

}