package dev.prtjohanson.exc_2023_02_18.exc10to13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public interface Product {
    BigInteger getPrice();
    boolean isAvailable(LocalDate date);
}
