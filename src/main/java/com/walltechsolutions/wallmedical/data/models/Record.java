package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String personalPathologicalHistory;
    private String familyPathologicalHistory;
    private String allergicHistory;

    @OneToOne(fetch = FetchType.LAZY)
    private Patient patient;

    @OneToMany(mappedBy = "record", fetch = FetchType.LAZY)
    private Set<RecordDetail> recordDetails = new HashSet<>();
}
