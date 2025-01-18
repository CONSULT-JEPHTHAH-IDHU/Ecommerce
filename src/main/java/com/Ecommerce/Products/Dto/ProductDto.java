package com.Ecommerce.Products.Dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {


    @NotEmpty
    private String name;
    @NotEmpty
    private String productCategory;
    @NonNull
    private int qty;
    private String description;
    @NonNull
    private Double price;


}
