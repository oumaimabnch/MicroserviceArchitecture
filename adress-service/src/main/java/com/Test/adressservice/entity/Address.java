package com.Test.adressservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="addresstable")
public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String street;
        private String country;

        private String city;

        private String state;
        private int hotelsNumb;
        private int housesNumb;
        private int test;
        private String testfinal;
        private String hiifrommaster;
        private String helloinanotherbranch;









        private String zipCode;


}
