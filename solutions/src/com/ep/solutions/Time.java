package com.ep.solutions;

import java.util.Calendar;
import java.util.Date;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor that creates a Time object for the current time
    public Time() {
        Calendar calendar = Calendar.getInstance();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    // Constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    // Constructor that constructs a Time object with the specified hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Method to set a new time based on elapsed time since midnight, January 1, 1970
    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24); // Convert to 24-hour format

        Date now  = new Date(elapsedTime);
        this.second = now.getSeconds();
    }

    // Override toString method to display time in HH:MM:SS format
    @Override
    public String toString() {

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Main method for testing
    public static void main(String[] args) {
        Time time1 = new Time(); // Current time
        System.out.println("Current time: " + time1);

        Time time2 = new Time(555550000); // Specified elapsed time
        System.out.println("Time from elapsed milliseconds: " + time2);

        Time time3 = new Time(5, 23, 55); // Specified hour, minute, and second
        System.out.println("Specified time: " + time3);
    }
}