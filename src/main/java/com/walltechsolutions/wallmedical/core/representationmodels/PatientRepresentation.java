package com.walltechsolutions.wallmedical.core.representationmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientRepresentation extends PersonRepresentation {

    private ZonedDateTime birthDate;

    private RecordRepresentation record;

    private Set<ContactRepresentation> contacts = new HashSet<>();
}
