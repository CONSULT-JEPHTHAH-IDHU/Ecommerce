package com.Ecommerce.Products.Models;

import com.Ecommerce.Utilities.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/****
 *  The Product Video is a link to
 *  our document service, pointing
 *  to a document in our DOCUMENT AS A SERVICE application
 * *******/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductVideo extends Base {

        private Product product;


}
