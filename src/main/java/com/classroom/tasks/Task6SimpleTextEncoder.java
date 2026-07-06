package com.classroom.tasks;

public class Task6SimpleTextEncoder {

    public static char shiftChar(char value, int shift) {
        shift %= 26;

        if (value >= 'A' && value <= 'Z') {
            return (char) ('A' + (value - 'A' + shift + 26) % 26);
        }

        if (value >= 'a' && value <= 'z') {
            return (char) ('a' + (value - 'a' + shift + 26) % 26);
        }

        return value;
    }

    public static String encode(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            result.append(shiftChar(text.charAt(i), shift));
        }

        return result.toString();
    }

    public static int countLetters(String text) {
        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                counter++;
            }
            }
        return counter;

    }
}
