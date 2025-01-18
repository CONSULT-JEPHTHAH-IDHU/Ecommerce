package com.Ecommerce.Products.Models;

import com.Ecommerce.Users.Models.User;
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
public class Product extends Base {
    private String name;
    private ProductCategory category;
    private int quantity;
    private String description;
    private Double price;
    private User user;

    /***
     *
     * Note: Documents would not be store in
     * the database but would be saved outside the application
     * and links to the documents would be made available.
     *
     * This would make us have a product: DOCUMENT as a SERVICE to the
     * general public and our customers might be our first sets of
     * users and then the general public.
     *
     ****/

    /*****
     *   Sellers are expected to show at most
     *   10 pictures of their products
     * ******/
    private List<ProductImages> imagesList;

    /*****
     * Sellers can also choose to upload short videos
     * of their product if they choose to. The video
     * might not be more than 5mb between the
     * ranges of 1-3mb normally.( very short video)     *
     * *****/
    private List<ProductVideo> productVideos;

    /*****
     *
     * Note pls  recall Federal High Court Katsina where
     * we can now have an online office platform integrated
     * platform where people can subscribe to and then
     * work comfortably with desktop publishing tools available,
     * and office document templating
     *
     *  I CAll this Service [ OFFICE-SPACE or WORK-SPACE ]
     *
     *  Considerations
     *  Space Management: document spacing
     *  Security: Data encryption Support
     *  Compression: Data Compression
     *  Speed: Data Availability : Data Search Algorithm
     *
     * *****/
}
