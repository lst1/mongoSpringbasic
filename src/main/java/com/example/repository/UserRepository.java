package com.example.repository;

import com.example.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * Created by lukasz on 2017-09-24.
 */
public interface UserRepository extends MongoRepository<User, String> {

    public User findOneByName(String name);

}
