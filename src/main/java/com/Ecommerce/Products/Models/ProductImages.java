package com.Ecommerce.Products.Models;

import com.Ecommerce.Utilities.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/****
 *  The Product Image is a link to
 *  our document service, pointing
 *  to a document in our DOCUMENT AS A SERVICE application
 * *******/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductImages extends Base {
    private Product product;
}
