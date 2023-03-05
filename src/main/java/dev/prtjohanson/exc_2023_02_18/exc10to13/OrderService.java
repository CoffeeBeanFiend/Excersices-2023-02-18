package dev.prtjohanson.exc_2023_02_18.exc10to13;

import java.math.BigInteger;
import java.time.LocalDate;


public class OrderService {
    final private Basket basket;
    BigInteger total;
    LocalDate date;

    public OrderService(Basket basket, LocalDate date) {
        this.basket = basket;
        this.date = date;
    }

    public BigInteger getTotal() {
        if (total != null) {
            return total;
        }

        return total = basket.getAllProductsWithQuantity()
                // Filter out available products by specified order date.
                // In the hashmap entry, key is the product.
                .filter(
                    (entry) -> entry.getKey().isAvailable(date)
                )

                // Calculate total by multiplying price by quantity.
                // In the hashmap entry, key is the product and value is its quantity.
                .map(
                        (entry) -> entry.getKey().getPrice()
                                // Multiply price by quantity
                                .multiply(
                                        // Create a new BigInteger instance from quantity
                                        // to multiply price with.
                                        BigInteger.valueOf(entry.getValue())
                                )
                )

                // Sum over price multiplied by quantity.
                .reduce(
                        BigInteger.ZERO,
                        (total, current) -> total.add(current)
                );
    }
}
