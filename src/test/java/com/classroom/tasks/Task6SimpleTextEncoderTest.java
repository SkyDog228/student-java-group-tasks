package com.classroom.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task6SimpleTextEncoderTest {

    @Test
    void shiftsLettersAndWrapsAlphabet() {
        assertEquals('C', Task6SimpleTextEncoder.shiftChar('A', 2));
        assertEquals('b', Task6SimpleTextEncoder.shiftChar('z', 2));
        assertEquals('Z', Task6SimpleTextEncoder.shiftChar('A', -1));
        assertEquals('!', Task6SimpleTextEncoder.shiftChar('!', 5));
    }

    @Test
    void encodesTextPreservingCaseAndSymbols() {
        assertEquals("Cde B!", Task6SimpleTextEncoder.encode("Abc Z!", 2));
        assertEquals("Ifmmp!", Task6SimpleTextEncoder.encode("Hello!", 1));
    }

    @Test
    void countsLettersOnly() {
        assertEquals(5, Task6SimpleTextEncoder.countLetters("Hello!"));
        assertEquals(4, Task6SimpleTextEncoder.countLetters("Java 17"));
        assertEquals(0, Task6SimpleTextEncoder.countLetters("123 !"));
    }
}
