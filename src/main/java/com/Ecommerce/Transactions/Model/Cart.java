package com.Ecommerce.Transactions.Model;

import com.Ecommerce.Utilities.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart extends Base {

    /******
     *
     * Note : a customer cannot have more than one
     * cart attached to a one seller per day if a seller is
     * having more than one product a customer is getter;
     *
     * but a customer can have more than one transaction from
     * many seller and not a cart for many seller
     *
     * cart only work when a customer is getting from a
     * particular seller. it does not work when a
     * seller is buying from multiple seller
     *
     * ********/

    private List<Transaction> transactions;
}
