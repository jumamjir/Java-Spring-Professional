package com.devsuperior.avaliacao;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AvaliacaoApplication implements CommandLineRunner {
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(AvaliacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order(1034, 150.00, 20);
        System.out.println("Pedido Código: " + order1.getCode());
        System.out.println("Valor Total: " + orderService.total(order1));
//        Order order2 = new Order(2282, 800.00, 10);
//        Order order3 = new Order(1309, 95.90, 0);

    }
}
