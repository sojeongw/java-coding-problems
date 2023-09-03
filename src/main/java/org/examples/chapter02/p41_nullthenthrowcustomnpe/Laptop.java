package org.examples.chapter02.p41_nullthenthrowcustomnpe;

public class Laptop {
    private Integer price;
    private String name;

    public Laptop(Integer price, String name) {
        this.price = price;
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}