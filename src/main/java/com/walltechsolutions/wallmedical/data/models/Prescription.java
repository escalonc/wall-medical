package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private RecordDetail recordDetail;

    private String information;
}
