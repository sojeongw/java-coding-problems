package org.examples.chapter02.p40_checknullsfunctionalnonfunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // List 라면 리스트 참조 자체와 List가 가지고 있는 객체 각각에 대한 null를 해야하므로 List로 예제를 구현한다.
        List<Integer> input = Arrays.asList(1, 2, null, 4);

        List<Integer> result1 = checkNullNonFunctional(input);
        System.out.println("result1 = " + result1);

        List<Integer> result2 = checkNullFunctional(input);
        System.out.println("result2 = " + result2);
    }

    private static List<Integer> checkNullNonFunctional(List<Integer> input) {
        if (Objects.isNull(input)) {
            return Collections.EMPTY_LIST;
        }

        ArrayList<Integer> filteredList = new ArrayList<>();

        for (Integer element : input) {
            if (Objects.nonNull(element)) {
                filteredList.add(element);
            }
        }

        return filteredList;
    }

    private static List<Integer> checkNullFunctional(List<Integer> input) {
        // 사실 Objects는 함수형 스타일 코드에서 predicate로 쓰일 목적으로 만들어졌다.
        if (Objects.isNull(input)) {
            throw new IllegalArgumentException();
        }

        return input.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
