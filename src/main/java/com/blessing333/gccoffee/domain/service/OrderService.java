package com.blessing333.gccoffee.domain.service;

import com.blessing333.gccoffee.domain.Email;
import com.blessing333.gccoffee.domain.Order;
import com.blessing333.gccoffee.domain.OrderItem;

import java.util.List;

public interface OrderService {
    Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems);
}
