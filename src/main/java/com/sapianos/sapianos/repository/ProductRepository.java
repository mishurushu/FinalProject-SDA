package com.sapianos.sapianos.repository;

import com.sapianos.sapianos.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
