package org.examples.chapter01.p02_firstnonrepeatedcharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int[] ascii = new int[256];

        for (char c : input.toCharArray()) {
            ascii[c]++;
        }

        for (char c : input.toCharArray()) {
            if (ascii[c] == 1) {
                System.out.println("result = " + c);
                return;
            }
        }
    }
}
