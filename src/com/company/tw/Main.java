package com.company.tw;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            final int asteriskNum = i * 2 - 1;
            final int backspaceNum = n - i;
            System.out.println(generateOneLine(asteriskNum, backspaceNum));
        }

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
