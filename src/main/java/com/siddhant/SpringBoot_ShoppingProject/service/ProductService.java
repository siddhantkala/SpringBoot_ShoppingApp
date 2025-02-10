package com.siddhant.SpringBoot_ShoppingProject.service;

import com.siddhant.SpringBoot_ShoppingProject.model.Product;
import com.siddhant.SpringBoot_ShoppingProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products=new ArrayList<>(Arrays.asList(new Product(1,"Shoes",250),
//            new Product(2,"Jeans",550),
//            new Product(3,"Shirt",450)));

    public List<Product> getProducts()
    {
        return repo.findAll();
        //return products;
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
//        return products.stream()
//                .filter(p->p.getProdId()==prodId)
//                .findFirst().get();
    }

    public void addProduct(Product product) {
        repo.save(product);
//        System.out.println(product);
//        products.add(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
//        int index=0;
//        for(int i=0;i<products.size();i++)
//        {
//            if(products.get(i).getProdId()==product.getProdId())
//                index=i;
//        }
//        products.set(index,product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
//        for(int i=0;i<products.size();i++)
//        {
//            if(products.get(i).getProdId()==prodId)
//            {
//                products.remove(i);
//                break;
//            }
//        }
    }
}
