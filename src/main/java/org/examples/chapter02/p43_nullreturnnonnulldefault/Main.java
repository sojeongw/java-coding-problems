package org.examples.chapter02.p43_nullreturnnonnulldefault;

import org.examples.chapter02.p41_nullthenthrowcustomnpe.Laptop;

import java.util.Objects;
import java.util.Optional;

public class Main {

    private static Laptop checkNull(Laptop object) {
        return Optional.of(object)
                .orElse(new Laptop(100, "mac"));
    }
}
