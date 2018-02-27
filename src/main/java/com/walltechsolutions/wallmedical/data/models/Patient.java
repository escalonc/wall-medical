package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Patient extends Person {

    private ZonedDateTime birthDate;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "patient")
    private Record record;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private Set<Contact> contacts = new HashSet<>();
}
