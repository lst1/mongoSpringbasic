package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lukasz on 2017-09-24.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    //create
    @RequestMapping(method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody User user){
        userRepository.save(user);
    }

    //read
    @RequestMapping(method= RequestMethod.GET, value = "/{id}")
    public User read(@PathVariable String id){
        return userRepository.findOne(id);
    }

    //readall
    @RequestMapping(method= RequestMethod.GET)
    public List<User> readall(){
        return userRepository.findAll();
    }

    //update
    @RequestMapping(method= RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody User user){
        userRepository.save(user);
    }

    //delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        userRepository.delete(id);
    }
}
