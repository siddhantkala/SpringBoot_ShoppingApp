package com.siddhant.SpringBoot_ShoppingProject.service;

import com.siddhant.SpringBoot_ShoppingProject.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products=Arrays.asList(new Product(1,"Shoes",250),
            new Product(2,"Jeans",550),
            new Product(3,"Shirt",450));

    public List<Product> getProducts()
    {
        return products;
    }

    public Product getProductById(int prodId) {
        
    }
}
