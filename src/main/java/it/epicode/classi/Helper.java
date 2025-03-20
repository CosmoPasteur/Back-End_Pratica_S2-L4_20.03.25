package it.epicode.classi;

import java.util.List;

public class Helper {

    public static List<Product> products = List.of(
            new Product("Prodotto 1", "Categoria 1", 100.0),
            new Product("Prodotto 2", "Categoria 2", 200.0),
            new Product("Prodotto 3", "Categoria 3", 300.0),
            new Product("Prodotto 4", "Categoria 4", 400.0),
            new Product("Prodotto 5", "Categoria 5", 500.0)
    );

    public static List<Order> orders = List.of(

    );

    public static List<Customer> customers = List.of(
            new Customer("Customer 1", 1),
            new Customer("Customer 2", 2),
            new Customer("Customer 3", 3),
            new Customer("Customer 4", 4),
            new Customer("Customer 5", 5)
    );
}
