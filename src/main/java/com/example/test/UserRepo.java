package com.example.test;

import org.springframework.data.repository.CrudRepository;
import com.example.test.User;
public interface UserRepo extends CrudRepository<User, Integer> {

}
