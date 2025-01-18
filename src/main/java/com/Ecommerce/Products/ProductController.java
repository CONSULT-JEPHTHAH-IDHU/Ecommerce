package com.Ecommerce.Products;


import com.Ecommerce.Products.Services.Product_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    Product_services productServices;

    @GetMapping
    public ResponseEntity<?> products(){
        return productServices.products();
    }




}
