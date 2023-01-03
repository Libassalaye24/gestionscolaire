package com.gestionscolaire.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionscolaire.demo.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
