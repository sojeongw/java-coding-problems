package org.examples.chapter01.p02_firstnonrepeatedcharacter;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Character key = input.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .orElseThrow(NoSuchElementException::new).getKey();

        System.out.println("key = " + key);
    }
}
