package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;

import javax.persistence.*;

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
}
