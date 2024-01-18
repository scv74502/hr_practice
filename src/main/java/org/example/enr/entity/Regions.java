package org.example.enr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "regions")
public class Regions {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT", name = "region_id", nullable = false)
    private Integer regionID;

    @Column(name = "region_name", length = 25)
    private String regionName;

    @OneToMany(mappedBy = "region")
    private List<Country> country;
}
