package com.gestionscolaire.demo.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("eleve")
public class Eleve {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String age;
    private String avatar;

    @OneToMany(mappedBy = "eleve")
    private List<Inscription> inscriptions = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "parent", referencedColumnName = "id")
    private Parent parent;
}
