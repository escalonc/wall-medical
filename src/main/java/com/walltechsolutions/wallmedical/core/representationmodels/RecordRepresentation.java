package com.walltechsolutions.wallmedical.core.representationmodels;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

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
