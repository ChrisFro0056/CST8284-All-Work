package assignment1.locationTest_JUnit;

/*
    File name: LocationTest.java
    Author: Christopher Frosst
    Course: CST8284 section 301
    Term: Spring2024
    Assignment: Assignment 1
    Date: June 10th, 2024
    Purpose: use JUnit to test the Location class with incorrect data
 */

import assignment1.location.Location;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IncorrectData {

    @Test
    @DisplayName("Test Data with incorrect data")

    public void distanceTo(){
        Location location1 = new Location();
        // 2D array to store the location data
        String[][] locationData = {
                {"45.43", "-75.8291"},
                {"K2U", "45.018", "-75.8391"},
                {"K1W", "45.45900189"},
                {"K1M", "-75.5829"},
                {"K2A", "forty-five decimal 1 oh 3", "-75.5482"}
        };

        // Print header
        System.out.printf("      K1B   K2B   K2L   K1Z   K1G\n");

        // Print the distance between each location
        for (int i = 0; i < locationData.length; i++) {
            location1.setPostalCode(locationData[i][0]);
            location1.setLatitude(Double.parseDouble(locationData[i][1]));
            location1.setLongitude(Double.parseDouble(locationData[i][2]));

            // Process the ith row
            System.out.printf("%s", location1.getPostalCode());

            // print the distance between each location
            for (int j = 0; j < locationData.length; j++) {
                Location location2 = new Location();
                location2.setPostalCode(locationData[j][0]);
                location2.setLatitude(Double.parseDouble(locationData[j][1]));
                location2.setLongitude(Double.parseDouble(locationData[j][2]));

                System.out.printf(" %.3f", location1.distanceTo(location2));
            }
            System.out.println();



        }
    }
}