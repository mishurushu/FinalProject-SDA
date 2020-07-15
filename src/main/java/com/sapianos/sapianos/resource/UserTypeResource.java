package com.sapianos.sapianos.resource;


import com.sapianos.sapianos.models.UserType;
import com.sapianos.sapianos.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/userType")
public class UserTypeResource {

    @Autowired
    private UserTypeRepository userTypeRepository;


    @GetMapping
    public Iterable<UserType> findAll(){
       return userTypeRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<UserType> findById(@PathVariable Integer id){
        return userTypeRepository.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserType save(@RequestBody UserType userType){
        return  userTypeRepository.save(userType);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserType update(@RequestBody UserType userType){
        return userTypeRepository.edit(userType);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable UserType userType){
        userTypeRepository.delete(userType);
    }
}
