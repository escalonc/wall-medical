package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   private String identificationNumber;
   private String name;
   private String middleName;
   private String lastName;

   @OneToMany(fetch = FetchType.LAZY)
   private Set<Contact> contacts = new HashSet<>();
}
