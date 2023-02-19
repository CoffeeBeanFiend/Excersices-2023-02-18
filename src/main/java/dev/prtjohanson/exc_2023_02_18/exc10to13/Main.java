package dev.prtjohanson.exc_2023_02_18.exc10to13;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final Basket basket = new Basket();
        final LocalDate now = LocalDate.now();

        final Product[] products = {
                new GenericProduct(
                        () -> new BigInteger("100"),
                        (date) -> date.isAfter(now.minusDays(1))
                ),
                new GenericProduct(
                        () -> new BigInteger("2000"),
                        (date) ->date.isAfter(now.minusDays(1))
                ),
                new GenericProduct(
                        () -> new BigInteger("5149"),
                        (date) -> date.isAfter(now.minusDays(1))
                ),
                new GenericProduct(
                        () -> new BigInteger("2149"),
                        (date) -> date.isAfter(now.minusDays(1))
                ),
                new GenericProduct(
                        () -> new BigInteger("5312"),
                        (date) -> date.isAfter(now.minusDays(1))
                ),
        };

        // Add products to basket.
        Arrays.stream(products).forEach(product -> basket.add(
                product,
                (int)(32 + Math.random()*100) // Generate random numbers between 32 and 132.
        ));

        // Remove some products from basket, but always less than was added.
        Arrays.stream(products).forEach(product -> basket.remove(
                product,
                (int)(1 + Math.random()*30) // Generate random numbers between 1 and 31.
        ));

        System.out.println(basket);

        // Get total from OrderService
        System.out.println(
                "Total: " + (new OrderService(basket)).getTotal()
        );
    }
}
