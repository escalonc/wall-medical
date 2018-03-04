package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Patient extends Person {

    private ZonedDateTime birthDate;

    @OneToOne(mappedBy = "patient", fetch = FetchType.LAZY)
    private Record record;

    private Gender gender;
}

enum Gender {
    MALE,
    FEMALE
}
