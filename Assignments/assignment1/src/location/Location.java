package assignment1.location;

/*
    File name: LocationTest.java
    Author: Christopher Frosst
    Course: CST8284 section 301
    Term: Spring2024
    Assignment: Assignment 1
    Date: June 10th, 2024
    Purpose: Formats and prints the location information
 */

/**
 * Class to store the location information
 */
public class Location {

    /**
     * Instance variables
     */
    private String postalCode;
    private double latitude;
    private double longitude;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    /**
     * Method to calculate the distance between two locations
     * @param location
     * @return
     */
    public double distanceTo(Location location) {
        return Math.sqrt(Math.pow(this.latitude - location.latitude, 2) + Math.pow(this.longitude - location.longitude, 2));

    }
}
