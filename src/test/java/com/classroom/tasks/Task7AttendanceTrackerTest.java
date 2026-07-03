package com.classroom.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task7AttendanceTrackerTest {

    @Test
    void countsPresentRecordsIgnoringCaseAndInvalidCharacters() {
        assertEquals(3, Task7AttendanceTracker.countPresent("P A l x p P"));
        assertEquals(0, Task7AttendanceTracker.countPresent("AALx"));
    }

    @Test
    void countsAbsentRecordsIgnoringCaseAndInvalidCharacters() {
        assertEquals(1, Task7AttendanceTracker.countAbsent("P A l x p P"));
        assertEquals(3, Task7AttendanceTracker.countAbsent("aaap"));
    }

    @Test
    void checksPerfectAttendance() {
        assertEquals(true, Task7AttendanceTracker.hasPerfectAttendance("PPpp"));
        assertEquals(false, Task7AttendanceTracker.hasPerfectAttendance("PAP"));
        assertEquals(false, Task7AttendanceTracker.hasPerfectAttendance("p a p"));
    }
}
