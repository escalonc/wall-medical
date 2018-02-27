package com.walltechsolutions.wallmedical.core.representationmodels;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoctorRepresentation extends PersonRepresentation {

    private String speciality;
    private Set<ContactRepresentation> contacts = new HashSet<>();
}
