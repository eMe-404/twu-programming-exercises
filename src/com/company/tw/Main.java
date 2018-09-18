package com.company.tw;

public class Main {

    public static void main(String[] args) {
        int num = 100;
        fizzBuzz(num);
    }

    private static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            StringBuilder outputStr = new StringBuilder();
            if (i % 3 == 0) {
                outputStr.append("Fizz");
            }
            if (i % 5 == 0) {
                outputStr.append("Buzz");
            }
            if (outputStr.length() == 0) {
                outputStr.append(i);
            }

            System.out.println(outputStr);

        }
    }
}
