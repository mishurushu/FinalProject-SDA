package com.sapianos.sapianos.resource;


import com.sapianos.sapianos.models.Description;
import com.sapianos.sapianos.repository.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/description")
public class DescriptionResource {

    @Autowired
    private DescriptionRepository descriptionRepository;


    @GetMapping
    public Iterable<Description> findAll() {
        return descriptionRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Description> findById(@PathVariable Integer id) {
        return descriptionRepository.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Description save(@RequestBody Description description) {
        return descriptionRepository.save(description);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Description update(@RequestBody Description description) {
        return descriptionRepository.edit(description);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Description description) {
        descriptionRepository.delete(description);
    }
}