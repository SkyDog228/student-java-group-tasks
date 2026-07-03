package com.classroom.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1TextStatisticsTest {

    @Test
    void countsVowelsIgnoringCase() {
        assertEquals(4, Task1TextStatistics.countVowels("Java is Fun!"));
        assertEquals(10, Task1TextStatistics.countVowels("AEIOU aeiou"));
        assertEquals(0, Task1TextStatistics.countVowels("rhythm 123"));
    }

    @Test
    void countsWordsSeparatedBySpaces() {
        assertEquals(3, Task1TextStatistics.countWords("Java is Fun!"));
        assertEquals(4, Task1TextStatistics.countWords("  one   two three   four  "));
        assertEquals(0, Task1TextStatistics.countWords(""));
        assertEquals(0, Task1TextStatistics.countWords("     "));
    }

    @Test
    void countsCharactersWithoutSpaces() {
        assertEquals(10, Task1TextStatistics.countCharactersWithoutSpaces("Java is Fun!"));
        assertEquals(3, Task1TextStatistics.countCharactersWithoutSpaces("a b c"));
        assertEquals(0, Task1TextStatistics.countCharactersWithoutSpaces("   "));
    }
}
