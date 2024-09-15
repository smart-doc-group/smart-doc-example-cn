package com.power.doc.lamda;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {


    @Test
    public void test() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.stream().filter(number -> number < 5);
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}
