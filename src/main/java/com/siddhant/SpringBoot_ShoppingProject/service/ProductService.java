package com.siddhant.SpringBoot_ShoppingProject.service;

import com.siddhant.SpringBoot_ShoppingProject.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products=new ArrayList<>(Arrays.asList(new Product(1,"Shoes",250),
            new Product(2,"Jeans",550),
            new Product(3,"Shirt",450)));

    public List<Product> getProducts()
    {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().get();
    }

    public void addProduct(Product product) {
        System.out.println(product);
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index=0;
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getProdId()==product.getProdId())
                index=i;
        }
        products.set(index,product);
    }

    public void deleteProduct(int prodId) {
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getProdId()==prodId)
            {
                products.remove(i);
                break;
            }
        }
    }
}
