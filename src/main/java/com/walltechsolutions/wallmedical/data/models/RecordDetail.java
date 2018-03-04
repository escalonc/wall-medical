package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class RecordDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int bloodPressure;
    private String bloodPressureUnit;
    private int temperature;
    private String temperatureUnit;

    private String heartRate;
    private String RespiratoryRate;

    private String diagnosis;
    private String treatment;

    private ZonedDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    private Record record;

    @OneToMany(mappedBy = "recordDetail", fetch = FetchType.LAZY)
    private Set<Prescription> prescriptions = new HashSet<>();
}
