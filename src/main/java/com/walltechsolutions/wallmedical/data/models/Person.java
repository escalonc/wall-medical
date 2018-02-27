package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public abstract class Person {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   private String identificationNumber;
   private String name;
   private String middleName;
   private String lastName;
}
