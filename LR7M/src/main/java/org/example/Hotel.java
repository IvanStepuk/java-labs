package org.example;

public class Hotel {
    private String name;
    private int stars;
    private int rooms;
    public static int totalHotels = 0;
    public static int totalRooms = 0;
    public Hotel(String name, int stars, int rooms) {
        this.name = name;
        this.stars = stars;
        this.rooms = rooms;
        totalHotels++;
        totalRooms += rooms;
    }
    public String getName() {
        return name;
    }
    public int getStars() {
        return stars;
    }
    public int getRooms() {
        return rooms;
    }
    public static double getAverageRooms() {
        if (totalHotels == 0) {
            return 0.0;
        }
        return (double) totalRooms / totalHotels;
    }
}
