package org.examples.chapter02.p44_checkindexbetweenzerolength;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int length = 5;
        int idx = 5;

        checkIndex(length, idx);
    }

    private static void checkIndex(int length, int idx) {
        Objects.checkIndex(idx, length);
    }
}
