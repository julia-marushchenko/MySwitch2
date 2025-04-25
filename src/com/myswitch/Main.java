// Java program to demonstrate switch statement with multiple cases
package com.myswitch;

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        int day = 4;
        String dayString;
        String dayType;

        // Switch cases with int data type
        switch (day) {

                // Case
            case 1:
                dayString = "Monday";
                break;

                // Case
            case 2:
                dayString = "Tuesday";
                break;

                // Case
            case 3:
                dayString = "Wednesday";
                break;

                // Case
            case 4:
                dayString = "Thursday";
                break;

                // Case
            case 5:
                dayString = "Friday";
                break;

                // Case
            case 6:
                dayString = "Saturday";
                break;

                // Case
            case 7:
                dayString = "Sunday";
                break;

                // Default case
            default:
                dayString = "Holiday";
        }

        switch (day) {
            // Multiple cases
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
            default:
                dayType = "Holiday";
        }

        // Printing requested day to console
        System.out.println(dayString + " is a " + dayType);
    }
}