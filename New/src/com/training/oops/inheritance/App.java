package com.training.oops.inheritance;

public class App {
    public static void main(String[] args) {
        Home h = new Home();
        h.printNoOfLights(5);

        Home h1 = new DiningRoom();
        h1.printNoOfLights(10);
//
//        Home h2 = new LivingRoom();
//        h2.printNoOfLights("Living Room");
    }
}
