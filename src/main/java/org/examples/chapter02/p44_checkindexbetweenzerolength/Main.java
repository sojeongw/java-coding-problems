package org.examples.chapter02.p44_checkindexbetweenzerolength;

public class Main {
    public static void main(String[] args) {
        int length = 5;
        int idx = 5;

        checkIndex(length, idx);
    }

    private static void checkIndex(int length, int idx) {
        if (0 > idx || idx >= length) {
            throw new IndexOutOfBoundsException("최대 길이를 초과했습니다.");
        }
    }
}
