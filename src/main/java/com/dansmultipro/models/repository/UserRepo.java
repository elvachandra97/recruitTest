package com.dansmultipro.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.dansmultipro.models.entities.User;

public interface UserRepo extends CrudRepository<User, String>{
    
}
