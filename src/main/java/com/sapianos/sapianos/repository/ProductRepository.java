package com.sapianos.sapianos.repository;

import com.sapianos.sapianos.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.Map;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    Map<Integer, Product> productMap = new HashMap<>();

    default Product edit(Product product){
        int productId = product.getProductId();
        if(productMap.get(productId) != null){
            productMap.put(productId, product);
            return productMap.get(productId);
        }
        return null;
    }

}
