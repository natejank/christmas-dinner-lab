package org.team2168.LibLessons;

import java.util.ArrayList;
import java.util.Arrays;

public class Date {
    /* variables */

    // member variables
    private String month;
    private int day;
    private int year;

    /* constructors
    These are overloaded, so a date can be initialized with mdy, my, or no input */
    public Date(String month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public Date(String month, int year) {
        this(month, 1, year);
    }

    public Date(String month) {
        this(month, 1, 1970);
    }

    public Date(int year) {
        this ("Jan", 1, year);
    }

    public Date() {
        this("Jan", 1, 1970);
    }

    public void writeOutput() {
        System.out.println(String.format("%s %d, %d", month, day, year));
    }

    /* setters and getters */
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        final ArrayList<String> MONTHS = new ArrayList<String>(
            Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

        if (MONTHS.contains(month))
            this.month = month;
        else
            throw new IllegalArgumentException("Invalid value provided for month!");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31)
            this.day = day;
        else
            throw new IllegalArgumentException("Invalid value provided for day!");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0)
            this.year = year;
        else
            throw new IllegalArgumentException("Invalid value provided for year!");
    }
}
