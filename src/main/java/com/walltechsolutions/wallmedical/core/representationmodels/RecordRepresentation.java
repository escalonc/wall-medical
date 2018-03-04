package com.walltechsolutions.wallmedical.core.representationmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@JsonIgnoreProperties(value = "patient",ignoreUnknown = true)
public class RecordRepresentation {

    private long id;
    private String medicalHistory;
    private PatientRepresentation patient;
    private Set<RecordDetailRepresentation> recordDetails = new HashSet<>();
}
