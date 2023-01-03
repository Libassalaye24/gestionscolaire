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
@DiscriminatorValue("anneeScolaire")
@Data
public class AnneeScolaire {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String libelle;

    @OneToMany(mappedBy = "anneeScolaire")
    private List<Inscription> inscriptions = new ArrayList<>();
}
