package com.walltechsolutions.wallmedical.core.representationmodels;

import lombok.Data;

@Data
public abstract class PersonRepresentation {

    private long id;

    private String identificationNumber;
    private String name;
    private String middleName;
    private String lastName;
}
