package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Data
@Entity
public class RecordDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String diagnosis;
    private String treatment;

    private ZonedDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "record_id")
    private Record record;
}
