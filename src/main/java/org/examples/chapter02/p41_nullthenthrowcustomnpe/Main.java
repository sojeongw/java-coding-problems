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

        if (Objects.isNull(input.getName())) {
            throw new NullPointerException("이름이 존재하지 않습니다.");
        }

        if (Objects.isNull(input.getPrice())) {
            throw new NullPointerException("가격이 존재하지 않습니다.");
        }
    }


}
