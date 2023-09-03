package org.examples.chapter02.p41_nullthenthrowcustomnpe;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        checkNull(new Laptop(100, "macbook"));
    }

    private static void checkNull(Laptop input) {
        if (Objects.isNull(input)) {
            throw new NullPointerException("상품이 존재하지 않습니다.");
        }

        // null이면 NPE를 던지고 아니면 검사한 참조를 반환한다.
        Objects.requireNonNull(input.getPrice(), "가격이 존재하지 않습니다.");
        Objects.requireNonNull(input.getName(), "이름이 존재하지 않습니다.");
    }


}
