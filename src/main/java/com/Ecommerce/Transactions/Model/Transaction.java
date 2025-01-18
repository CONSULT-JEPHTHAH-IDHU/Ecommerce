package com.Ecommerce.Transactions.Model;

import com.Ecommerce.Products.Models.Product;
import com.Ecommerce.Users.Models.User;
import com.Ecommerce.Utilities.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction extends Base {
    private Product product;
    private int quantity;
    private User seller;
    private User customer;
}


