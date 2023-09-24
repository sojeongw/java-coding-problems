package org.examples.chapter02.p49_immutableclass;

import java.util.List;

public final class Car {

    /*
    * 불변 객체
    * 클래스를 final로 선언한다.
    * 필드를 private final로 선언한다.
    * publica 생성자나 팩터리 메서드로만 생성한다.
    * 게터를 제공한다.
    * 세터를 노출하지 않는다.
    * */
    private final List<String> users;

    private final int price;

    public Car(List<String> users, int price) {
        this.users = users;
        this.price = price;
    }

    public List<String> getUsers() {
        return users;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "users=" + users +
                ", price=" + price +
                '}';
    }
}
