package org.examples.chapter02.p46_equalshashcode;

import java.util.HashSet;

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

        HashSet<Object> set = new HashSet<>();
        set.add(car03);
        set.add(car04);

        // equals()를 재정의 했더라도 hashCode()를 재정의하지 않으면 2, 재정의 하면 1
        System.out.println("set.size() = " + set.size());

/*       동등한 값을 비교하는데에 비용이 많이 들기 때문에 자바는 버킷이라는 해시 기반 컨테이너로 동등 객체를 분류한다.
         따라서 동등한 값이면 동일한 해시를 반환해야 하고 동등하지 않으면 다른 해시 코드를 반환해야 한다.
         동등하지 않은 객체가 같은 해시를 가지면 해시 충돌이 발생하고 두 객체가 같은 버킷 안에 들어가버린다.
         즉, 자바는 해시 코드를 먼저 비교한 뒤 같을 때에만 equals()로 동등성을 비교한다.*/
    }
}
