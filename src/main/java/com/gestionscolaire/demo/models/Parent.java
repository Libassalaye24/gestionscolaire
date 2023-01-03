package com.gestionscolaire.demo.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@DiscriminatorValue("parent")
@Data
public class Parent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String telephone1;
    private String telephone2;
    private String telephoneUrgence;

    @OneToMany(mappedBy = "parent")
    private List<Eleve> eleves = new ArrayList<>();
}
