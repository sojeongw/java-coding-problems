package org.examples.chapter02.p43_nullreturnnonnulldefault;

import org.examples.chapter02.p41_nullthenthrowcustomnpe.Laptop;

import java.util.Objects;

public class Main {

    private static Laptop checkNull(Laptop object) {
        return Objects.requireNonNullElse(object, new Laptop(1000, "mac"));
    }
}
