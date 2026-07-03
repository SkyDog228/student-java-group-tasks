package com.classroom.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4ShoppingCartCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    void calculatesLineTotals() {
        assertEquals(30.0, Task4ShoppingCartCalculator.lineTotal(10.0, 3), DELTA);
        assertEquals(0.0, Task4ShoppingCartCalculator.lineTotal(9.99, 0), DELTA);
    }

    @Test
    void calculatesSimpleDiscountAmount() {
        assertEquals(0.0, Task4ShoppingCartCalculator.discountAmount(99.99), DELTA);
        assertEquals(10.0, Task4ShoppingCartCalculator.discountAmount(100.0), DELTA);
        assertEquals(20.0, Task4ShoppingCartCalculator.discountAmount(200.0), DELTA);
    }

    @Test
    void calculatesFinalPriceAfterDiscount() {
        assertEquals(50.0, Task4ShoppingCartCalculator.finalPrice(50.0), DELTA);
        assertEquals(90.0, Task4ShoppingCartCalculator.finalPrice(100.0), DELTA);
        assertEquals(180.0, Task4ShoppingCartCalculator.finalPrice(200.0), DELTA);
    }
}
