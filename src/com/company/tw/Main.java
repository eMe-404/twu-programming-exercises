package com.company.tw;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            System.out.println(generateAsterisk(i));
        }

    }

    private static StringBuilder generateAsterisk(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append("*");
        }
        return result;
    }

}
