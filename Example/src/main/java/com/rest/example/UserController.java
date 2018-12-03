package com.rest.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rest.model.User;
import com.rest.service.UserService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/user"})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void create(@RequestBody User user){
        userService.addUser(user);
    }

//    @GetMapping(path = {"/{id}"})
//    public User findOne(@PathVariable("id") int id){
//        return userService.findById(id);
//    }

    @PutMapping(path = {"/{id}"})
    public void update(@PathVariable("id") int id, @RequestBody User user){
        //user.setId(id);
        userService.updateUser(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public void delete(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.getAllUser();
    }
}
