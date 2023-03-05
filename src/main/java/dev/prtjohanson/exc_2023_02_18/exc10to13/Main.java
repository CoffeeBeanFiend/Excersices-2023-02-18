package dev.prtjohanson.exc_2023_02_18.exc10to13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public enum Action {
        ADD_TO_BASKET,
        ORDER_TOTAL,
        QUIT,
    }

    final static Map<String, Action> stringToAction = Map.of(
            "a", Action.ADD_TO_BASKET,
            "o", Action.ORDER_TOTAL,
            "q", Action.QUIT
    );

    public static void main(String[] args) {
        final Basket basket = new Basket();
        final LocalDate now = LocalDate.now();
        final Scanner stdIn =  new Scanner(System.in);

        System.out.println("Welcome to the Perishable Generic Product Shop!");

        while (true) {
            System.out.println("Type the letter 'a' and press enter to add a Generic Product to your basket.");
            System.out.println("Type the letter 'o' and press enter to get your basket's order to total.");
            System.out.println("Type the letter 'q' and press enter to exit.");

            System.out.println("Your choice: ");
            final String choice = stdIn.nextLine();

            if (stringToAction.containsKey(choice)) {
                final Action action = stringToAction.get(choice);

                switch(action) {
                    case ADD_TO_BASKET:
                    {
                        System.out.println("Please enter the price of the product: ");
                        final BigInteger price = new BigInteger(stdIn.nextLine());

                        System.out.println("Please enter the quantity of product: ");
                        final int quantity = stdIn.nextInt();

                        System.out.println("Please enter the number of days left until the product perishes: ");
                        final int daysLeft = stdIn.nextInt();

                        final GenericProduct productToAdd = new GenericProduct(
                                () -> price,
                                (orderDate) -> now.plusDays(daysLeft).compareTo(orderDate) > 0
                        );

                        basket.add(productToAdd, quantity);

                        System.out.println("Product added!");

                        break;
                    }

                    case ORDER_TOTAL:
                    {
                        System.out.println("Please enter the number of days in which the order will be filled: ");
                        final int daysLeftUntilOrderFulfillment = stdIn.nextInt();

                        final LocalDate dateOfFulfillment = now.plusDays(daysLeftUntilOrderFulfillment);

                        System.out.println(
                                "Total: " + (new OrderService(basket, dateOfFulfillment)).getTotal()
                        );

                        break;
                    }

                    case QUIT:
                    {
                        System.out.println("Bye!");
                    }
                }
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
    }
}
