package com.walltechsolutions.wallmedical.core.representationmodels;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactRepresentation {

    private long id;

    private String phoneNumber;
    private String address;
    private String email;

    private DoctorRepresentation doctor;

    private PatientRepresentation patient;
}
