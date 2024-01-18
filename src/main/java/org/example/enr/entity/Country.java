package org.example.enr.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "countries")
public class Country {
    @Id
    @Column(columnDefinition = "CHAR", name = "country_id", nullable = false, length = 2)
    private String countryId;

    @Column(name = "country_name", length = 40)
    private String countryName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(columnDefinition = "BIGINT", name = "region_id", nullable = false)
    private Regions region;

}