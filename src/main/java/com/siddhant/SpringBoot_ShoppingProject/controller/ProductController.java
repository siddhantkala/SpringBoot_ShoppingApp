package com.siddhant.SpringBoot_ShoppingProject.controller;

import com.siddhant.SpringBoot_ShoppingProject.model.Product;
import com.siddhant.SpringBoot_ShoppingProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @RequestMapping("/product")
    public Product getProductById(int prodId)
    {
        return service.getProductById(prodId);
    }
}
