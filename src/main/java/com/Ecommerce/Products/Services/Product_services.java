package com.Ecommerce.Products.Services;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Product_services {

    public ResponseEntity<?> products(){
        return new ResponseEntity<>("this are the product list ",HttpStatusCode.valueOf(200));
    }

}
