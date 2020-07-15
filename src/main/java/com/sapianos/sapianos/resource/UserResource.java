package com.sapianos.sapianos.resource;

import com.sapianos.sapianos.models.User;
import com.sapianos.sapianos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<User> findById(@PathVariable Integer id){
        return userRepository.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public User save(@RequestBody User user){
        return  userRepository.save(user);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user){
        return userRepository.edit(user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable User user){
        userRepository.delete(user);
    }
}