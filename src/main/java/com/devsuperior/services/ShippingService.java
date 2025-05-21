package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    Order order;

    public double shipmentTax(double tax) {
        if (order.getBasicValue() <= 100) {
            tax = 20;
        } else if (order.getBasicValue() < 200) {
            tax = 12;
        } else {
            tax = 0;
        }
        return tax;
    }
}
