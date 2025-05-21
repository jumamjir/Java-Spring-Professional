package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ShippingService {
    ShippingService shippingService;
    public double total(Order order) {

    }
}
