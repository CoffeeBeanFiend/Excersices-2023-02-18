package dev.prtjohanson.exc_2023_02_18.exc10to13;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product {
    private Supplier<BigInteger> price;
    private Function<LocalDate, Boolean> supplier;

    public GenericProduct(
            Supplier<BigInteger> price,
            Function<LocalDate, Boolean> supplier
    ) {
        this.price = price;
        this.supplier = supplier;
    }

    @Override
    public BigInteger getPrice() {
        return price.get();
    }

    @Override
    public boolean isAvailable(LocalDate date) {
        return this.supplier.apply(date);
    }

    @Override
    public String toString() {
        return "\n\tGenericProduct{\n" +
                "\t\tprice=" + this.getPrice() + "," +
                "\n\t\tsupplier=" + isAvailable(LocalDate.now()) +
                "\n\t}";
    }
}
