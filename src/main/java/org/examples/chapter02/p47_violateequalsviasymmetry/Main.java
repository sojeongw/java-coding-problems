package org.examples.chapter02.p47_violateequalsviasymmetry;

public class Main {
    public static void main(String[] args) {
        // 한 번 생성하면 속성을 바꿀 수 없다.
        Car bongo = new Car(100, "bongo");

        // 불변: 원시 타입, String, Pattern, LocalDate
        // 가변: 배열
        // 불변일 수도, 아닐수도 있는: 컬렉션 -> 저장한 객체가 가변이면 가변이다.
        // 불변 객체의 장점: 동시성 이슈 해결. 가변 객체 상태 관리보다 새 객체 생성이 비용이 적게 든다. 가비지 컬렉션에서 특별하게 관리된다.
    }
}
