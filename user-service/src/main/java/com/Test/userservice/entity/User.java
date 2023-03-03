package com.Test.userservice.entity;

import jakarta.persistence.*;

@Entity
 @Table(name="usersdb")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nom;

     public User() {
     }

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public String getNom() {
         return nom;
     }

     public void setNom(String nom) {
         this.nom = nom;
     }
 }
