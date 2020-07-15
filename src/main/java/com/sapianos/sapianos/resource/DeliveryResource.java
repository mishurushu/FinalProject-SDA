package com.sapianos.sapianos.resource;


import com.sapianos.sapianos.models.Delivery;
import com.sapianos.sapianos.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/delivery")
public class DeliveryResource {

    @Autowired
    private DeliveryRepository deliveryRepository;


    @GetMapping
    public Iterable<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Delivery> findById(@PathVariable Integer id) {
        return deliveryRepository.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Delivery save(@RequestBody Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Delivery update(@RequestBody Delivery delivery) {
        return deliveryRepository.edit(delivery);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Delivery delivery) {
        deliveryRepository.delete(delivery);
    }
}