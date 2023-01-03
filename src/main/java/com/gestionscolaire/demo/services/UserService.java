package com.gestionscolaire.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionscolaire.demo.models.Role;
import com.gestionscolaire.demo.models.User;
import com.gestionscolaire.demo.repositories.RoleRepository;
import com.gestionscolaire.demo.repositories.UserRepository;

import lombok.extern.java.Log;


@Service
@Log
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public Role findRoleByLibelle(String libelle) {
        return roleRepository.findByLibelle(libelle);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User add(User user){
       try {
        userRepository.save(user);
        return user;
       } catch (Exception e) {
            log.severe(e.getLocalizedMessage());
            throw e;
       }
    }
}
