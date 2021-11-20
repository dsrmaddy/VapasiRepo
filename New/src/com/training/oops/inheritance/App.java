package com.training.oops.inheritance;

public class App {
    public static void main(String[] args) {
        Home h = new Home();
        h.printNoOfLights("Default Home");

        Home h1 = new DiningRoom();
        h1.printNoOfLights("Dining Room");

        Home h2 = new LivingRoom();
        h2.printNoOfLights("Living Room");
    }
}
