package com.classroom.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5GradebookReporterTest {

    private static final double DELTA = 0.0001;

    @Test
    void calculatesAverage() {
        assertEquals(72.0, Task5GradebookReporter.average(new int[]{95, 80, 65, 70, 50}), DELTA);
        assertEquals(100.0, Task5GradebookReporter.average(new int[]{100}), DELTA);
        assertEquals(0.0, Task5GradebookReporter.average(new int[]{}), DELTA);
    }

    @Test
    void returnsLetterGrades() {
        assertEquals("A", Task5GradebookReporter.letterGrade(95));
        assertEquals("B", Task5GradebookReporter.letterGrade(80));
        assertEquals("C", Task5GradebookReporter.letterGrade(79));
        assertEquals("D", Task5GradebookReporter.letterGrade(60));
        assertEquals("F", Task5GradebookReporter.letterGrade(59));
    }

    @Test
    void checksPassingScores() {
        assertEquals(true, Task5GradebookReporter.isPassing(60));
        assertEquals(true, Task5GradebookReporter.isPassing(100));
        assertEquals(false, Task5GradebookReporter.isPassing(59));
    }
}
