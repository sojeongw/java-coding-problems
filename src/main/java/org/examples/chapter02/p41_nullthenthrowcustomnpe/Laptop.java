package org.examples.chapter02.p41_nullthenthrowcustomnpe;

import java.util.Objects;

public class Laptop {
    private Integer price;
    private String name;

    public Laptop(Integer price, String name) {
        this.price = Objects.requireNonNull(price, "가격이 존재하지 않습니다.");
        this.name = Objects.requireNonNull(name, () -> "이름이 존재하지 않습니다." + " 이렇게 supplier에 exception 메시지를 매핑할 수 있다.");
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}