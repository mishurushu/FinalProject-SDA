package com.sapianos.sapianos.resource;


import com.sapianos.sapianos.models.Product;
import com.sapianos.sapianos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Product> findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product update(@RequestBody Product product) {
        return productRepository.edit(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Product product) {
        productRepository.delete(product);
    }
}