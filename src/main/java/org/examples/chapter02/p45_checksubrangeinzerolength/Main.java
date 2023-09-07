package org.examples.chapter02.p45_checksubrangeinzerolength;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int length = 5;

        int from = 0;
        int to = 6;

        Objects.checkFromToIndex(from, to, length);
    }
}
