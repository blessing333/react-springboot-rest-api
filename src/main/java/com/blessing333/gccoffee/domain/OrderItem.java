package com.blessing333.gccoffee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class OrderItem {
    private UUID productId;
    private Category category;
    private long price;
    private int quantity;
}
