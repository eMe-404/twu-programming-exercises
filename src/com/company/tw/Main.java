package com.company.tw;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        String name = "yaer";

        for (int i = 1; i < n; i++) {
            printOneLine(n, i);
        }

        System.out.println(name);

        for (int i = n - 1; i > 0; i--) {
            printOneLine(n, i);
        }

    }

    private static void printOneLine(int n, int i) {
        final int asteriskNum = i * 2 - 1;
        final int backspaceNum = n - i;
        System.out.println(generateOneLine(asteriskNum, backspaceNum));
    }

    private static StringBuilder generateOneLine(int asteriskNum, int backspaceNum) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < backspaceNum; i++) {
            result.append(" ");
        }

        for (int i = 0; i < asteriskNum; i++) {
            result.append("*");
        }

        return result;
    }

}
