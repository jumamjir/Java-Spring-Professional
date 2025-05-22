package com.devsuperior.avaliacao;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AvaliacaoApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(AvaliacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order(1034, 150.00, 20.0);
        System.out.println("\nPedido Código: " + order1.getCode());
        System.out.printf("Valor Total: R$ %.2f \n", orderService.total(order1));
        System.out.println(" ");

        Order order2 = new Order(2282, 800.00, 10.0);
        System.out.println("Pedido Código: " + order2.getCode());
        System.out.printf("Valor Total: R$ %.2f \n", orderService.total(order2));
        System.out.println(" ");

        Order order3 = new Order(1309, 95.90, 0.0);
        System.out.println("Pedido Código: " + order3.getCode());
        System.out.printf("Valor Total: R$ %.2f \n", orderService.total(order3) );
        System.out.println(" ");

    }
}
