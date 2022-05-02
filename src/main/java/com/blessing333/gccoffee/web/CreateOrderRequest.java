package com.blessing333.gccoffee.web;

import com.blessing333.gccoffee.domain.OrderItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CreateOrderRequest {
    private String email;
    private String address;
    private String postcode;
    private List<OrderItem> orderItems;
}
