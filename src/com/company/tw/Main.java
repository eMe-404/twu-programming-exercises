package com.company.tw;

public class Main {

    public static void main(String[] args) {
        int n = 8;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            result.append("*");
        }

        System.out.println(result);

    }
}
