package org.examples.chapter02.p49_immutableclass;

import java.util.List;

public class Car {

    private final List<String> users;

    private final int price;

    public Car(List<String> users, int price) {
        this.users = users;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "users=" + users +
                ", price=" + price +
                '}';
    }
}
