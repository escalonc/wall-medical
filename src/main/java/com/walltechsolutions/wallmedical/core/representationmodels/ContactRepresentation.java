package com.walltechsolutions.wallmedical.core.representationmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

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
