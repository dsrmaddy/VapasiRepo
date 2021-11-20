package com.training.oops.inheritance;

public class LivingRoom extends Home {
    String roomName = "Living Room";

    public void printNoOfLights(String roomName) {
        super.noOfLights = 3;
        super.printNoOfLights(roomName);
    }
}
