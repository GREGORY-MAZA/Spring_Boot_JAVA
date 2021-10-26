package com.Greg.controller;

import com.Greg.dao.ProductDao;
import com.Greg.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    //Produits
    @GetMapping(value = "Produits")
    public List<Product> listeProduits(){

        return productDao.findAll();
    }



    //Produits/{id}
    @GetMapping(value = "/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id){
       // Product product = new Product(id, "voiture", 19000);
        return productDao.findById(id);
    }

    @GetMapping(value = "hello")
        public  String hello(){
        return "oijefoijef";
    }

    @RequestMapping(value = "test")
    public  String displayHome(){
        return "index";
    }

}
