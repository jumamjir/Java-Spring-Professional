package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService  {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasicValue() * (1 - order.getDiscount()/100) + shippingService.shipmentTax(order);
    }
}
