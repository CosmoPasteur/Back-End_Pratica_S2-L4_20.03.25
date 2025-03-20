package it.epicode.esercizio_1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import it.epicode.classi.Helper;
import it.epicode.classi.Order;
import it.epicode.classi.Customer;

public class Main1 {

    public static void main(String[] args) {
        Map<Customer, List<Order>> ordersByCustomer = Helper.orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer));

        ordersByCustomer.forEach((customer, orders) -> {
            System.out.println("Customer: " + customer.getName());
            orders.forEach(order -> System.out.println("  Order ID: " + order.getId()));
        });
    }
}
