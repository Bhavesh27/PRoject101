package com.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//    void delete(User user);
//
//    List<User> findAll();
//
//    User findOne(int id);
//
//    User save(User user);
}
