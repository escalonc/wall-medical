package com.walltechsolutions.wallmedical.core.representationmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoctorRepresentation extends PersonRepresentation {

    private String speciality;
    private Set<ContactRepresentation> contacts = new HashSet<>();
}
