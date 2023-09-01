package org.examples.chapter01.p01_countduplicatecharacters;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요.");
        String input = scanner.next();

        Map<Integer, Long> result = input.chars()
                .boxed()
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));

        System.out.println("result = " + result);
    }
}
