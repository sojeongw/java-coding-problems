package org.examples.chapter02.p49_immutableclass;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // unmodifiable list
        List<String> users = List.of("anonymous", "someone");
        Car car = new Car(users, 100);

        System.out.println("car = " + car);
    }
}
