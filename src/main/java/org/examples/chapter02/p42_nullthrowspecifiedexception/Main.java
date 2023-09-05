package org.examples.chapter02.p42_nullthrowspecifiedexception;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        requireNonNullOrElseThrow(new Object(), "message");

    }

    // 직접 필요한 예외를 던지는 메서드를 만들어준다.
    private static <T> T requireNonNullOrElseThrow(T object, String message) {
        if (Objects.isNull(object)) {
            throw new IllegalArgumentException(message);
        }

        return object;
    }
}
