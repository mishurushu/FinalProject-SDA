package com.sapianos.sapianos.controler;

import com.sapianos.sapianos.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ProductControler {

    private final ProductRepository productRepository;

    public ProductControler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/product")
    public String getProduct(Model model){
        model.addAttribute("product",productRepository.findAll());

        return "product";
    }

}
