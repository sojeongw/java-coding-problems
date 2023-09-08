package org.examples.chapter02.p46_equalshashcode;

public class Main {
    public static void main(String[] args) {
        OneAndOnlyHandMadeCar car01 = new OneAndOnlyHandMadeCar(100, "one-and-only");
        OneAndOnlyHandMadeCar car02 = new OneAndOnlyHandMadeCar(100, "one-and-only");

        System.out.println(car01.equals(car02));    // false
        System.out.println("car01 = " + car01.hashCode());  // 212628335
        System.out.println("car02 = " + car02.hashCode());  // 1689843956

        Car car03 = new Car(100, "car");
        Car car04 = new Car(100, "car");

        System.out.println(car03.equals(car04));    // true
        System.out.println("car03 = " + car03.hashCode());  // 102321
        System.out.println("car04 = " + car04.hashCode());  // 102321
    }
}
