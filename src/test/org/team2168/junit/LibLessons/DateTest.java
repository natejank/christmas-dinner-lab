package org.team2168.junit.LibLessons;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.IllegalArgumentException;

import org.junit.jupiter.api.Test;
import org.team2168.LibLessons.Date;


public class DateTest {
    @Test
    void set_valid_months() {
        Date date = new Date();

        final String[] VALID_MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        for (String month : VALID_MONTHS) {
            assertDoesNotThrow(() -> date.setMonth(month), String.format("%s is a valid month input", month));
        }
    }

    @Test
    void set_invalid_month() {
        Date date = new Date();

        assertThrows(IllegalArgumentException.class, () -> date.setMonth("january"), "january is not a valid month");
    }

    @Test
    void set_valid_days() {
        Date date = new Date();

        assertDoesNotThrow(() -> date.setDay(22), String.format("the 22nd is a valid day for every month."));

    }

    @Test
    void set_invalid_years() {
        Date date = new Date();

        assertThrows(IllegalArgumentException.class, () -> date.setDay(0), "The 0th of the month is never valid");
        assertThrows(IllegalArgumentException.class, () -> date.setDay(32), "The 32nd is not valid on non-leap years");
    }
    
    @Test
    void set_valid_year() {
        Date date = new Date(2006);
        int testYear = 2168;

        date.setYear(testYear);

        assertEquals(testYear, date.getYear());
    }

    @Test
    void set_invalid_year() {
        Date date = new Date();

        assertThrows(IllegalArgumentException.class, () -> date.setYear(-1), "Years cannot be < 0");
    }

    @Test
    void write_output() {
        Date date = new Date("Jan", 1, 2100);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        date.writeOutput();
        assertEquals("Jan 1, 2100\n", outputStream.toString());

        System.setOut(System.out);
    }
}
