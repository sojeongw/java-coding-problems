package org.examples.chapter02.p40_checknullsfunctionalnonfunctional;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

    }

    private <T> boolean checkNullNonFunctional(T input) {
        return input == null;
    }

    private <T> boolean checkNullFunctional(T input) {
        return Objects.isNull(input);
    }
}
