package com.training.oops.inheritance;

public class DiningRoom extends Home{
    String roomName = "Dining Room";

    public void printNoOfLights(String roomName) {
        super.noOfLights = 4;
        super.printNoOfLights(roomName);
    }
}
