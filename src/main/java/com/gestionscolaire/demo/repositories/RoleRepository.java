package com.gestionscolaire.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionscolaire.demo.models.Role;

public interface RoleRepository extends JpaRepository<Role , Long>{
    Role findByLibelle(String libelle);
}
