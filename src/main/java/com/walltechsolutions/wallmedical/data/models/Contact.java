package com.walltechsolutions.wallmedical.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String phoneNumber;
    private String address;
    private String email;
}
