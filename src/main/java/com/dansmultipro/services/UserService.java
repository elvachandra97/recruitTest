package com.dansmultipro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dansmultipro.models.entities.User;
import com.dansmultipro.models.repository.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    public User create(User user){
        return userRepo.save(user);
    }

    public User findUser(String username){
        return userRepo.findById(username).get();
    }

    public Iterable<User> findAllUser(){
        return userRepo.findAll();
    }
}
