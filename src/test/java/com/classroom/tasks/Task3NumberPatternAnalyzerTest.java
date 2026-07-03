package com.classroom.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task3NumberPatternAnalyzerTest {

    @Test
    void sumsFromOneToPositiveZeroAndNegativeNumbers() {
        assertEquals(15, Task3NumberPatternAnalyzer.sumFromOneTo(5));
        assertEquals(1, Task3NumberPatternAnalyzer.sumFromOneTo(1));
        assertEquals(0, Task3NumberPatternAnalyzer.sumFromOneTo(0));
        assertEquals(-6, Task3NumberPatternAnalyzer.sumFromOneTo(-3));
    }

    @Test
    void detectsEvenNumbers() {
        assertTrue(Task3NumberPatternAnalyzer.isEven(2));
        assertTrue(Task3NumberPatternAnalyzer.isEven(0));
        assertTrue(Task3NumberPatternAnalyzer.isEven(-4));
        assertFalse(Task3NumberPatternAnalyzer.isEven(7));
    }

    @Test
    void describesNumberSign() {
        assertEquals("positive", Task3NumberPatternAnalyzer.positiveNegativeOrZero(5));
        assertEquals("negative", Task3NumberPatternAnalyzer.positiveNegativeOrZero(-3));
        assertEquals("zero", Task3NumberPatternAnalyzer.positiveNegativeOrZero(0));
    }
}
