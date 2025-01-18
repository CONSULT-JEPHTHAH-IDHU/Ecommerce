package com.Ecommerce.Products;


import com.Ecommerce.EcommerceApplication;
import com.Ecommerce.Products.Dto.ProductDto;
import com.Ecommerce.Products.Services.Product_services;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    Product_services productServices;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> products(){
        return productServices.products();
    }


    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveProduct(@Valid @RequestBody ProductDto productDto){
        return new ResponseEntity<>(productDto, HttpStatusCode.valueOf(200));
    }


    @PostMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> retrieveAProduct(@PathVariable("id") String productId){
        return new ResponseEntity<>("I Just retrieved a product having "+productId, HttpStatusCode.valueOf(200));
    }








}
