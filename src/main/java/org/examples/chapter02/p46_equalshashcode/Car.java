package org.examples.chapter02.p46_equalshashcode;

import java.util.Objects;

public class Car {
    private final int price;
    private final String name;

    public Car(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }
}
