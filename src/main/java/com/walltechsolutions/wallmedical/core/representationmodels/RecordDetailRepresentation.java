package com.walltechsolutions.wallmedical.core.representationmodels;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordDetailRepresentation {

    private long id;

    private String diagnosis;
    private String treatment;

    private ZonedDateTime date;

    @JsonIgnore
    private RecordRepresentation record;
}
