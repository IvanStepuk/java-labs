package org.example;

public class Train {
    private String destination;
    private String trainNumber;
    private String departureTime;
    public Train(String destination, String trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }
    public String getDestination() {
        return destination;
    }
    public String getTrainNumber() {
        return trainNumber;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void isDelayed(int minutes) {
        String[] parts = this.departureTime.split(":");
        int hours = Integer.parseInt(parts[0]);
        int mins = Integer.parseInt(parts[1]);
        mins += minutes;
        hours = (hours + mins / 60) % 24;
        mins = mins % 60;
        String hStr = (hours < 10) ? "0" + hours : "" + hours;
        String mStr = (mins < 10) ? "0" + mins : "" + mins;
        this.departureTime = hStr + ":" + mStr;
    }
}
