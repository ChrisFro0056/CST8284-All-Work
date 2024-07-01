package assignment1.locationTest;

/*
    File name: LocationTest.java
    Author: Christopher Frosst
    Course: CST8284 section 301
    Term: Spring2024
    Assignment: Assignment 1
    Date: June 10th, 2024
    Purpose: Test the Location class
 */

import assignment1.location.Location;

public class LocationTest {
    /**
     * @author Christopher Frosst
     */

    /**
     * Main method to test the Location class
     * @param args
     */

    public static void main(String[] args){
        Location location1 = new Location();
        // 2D array to store the location data
        String[][] locationData = {
                {"K1B", "45.4325", "-75.5624"},
                {"K2B", "45.3679", "-75.7888"},
                {"K2L", "45.3125", "-75.8838"},
                {"K1Z", "45.3956", "-75.7462"},
                {"K1G", "45.4118", "-75.6304"}
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
