package com.blessing333.gccoffee.web;

import com.blessing333.gccoffee.domain.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequest {
    private String productName;
    private Category category;
    private long price;
    private String description;
}
