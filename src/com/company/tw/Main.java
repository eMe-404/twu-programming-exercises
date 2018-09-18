package com.company.tw;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int num = 30;
        List<Integer> factorList = generate(num);
        System.out.println(factorList);
    }

    private static List<Integer> generate(int num) {

        List<Integer> factorList = new ArrayList<>();

        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                num /= factor;
                factorList.add(factor);
            } else {
                factor++;
            }
        }
        return factorList;
    }

}
