package com.Ecommerce.Utilities;

import com.Ecommerce.Users.Models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;



public class Base {
    private String ID;
    private Boolean is_Deleted;
    private Date created_Date;
    private User created_By;
    private Date modified_Date;
    private User modified_By;

}
