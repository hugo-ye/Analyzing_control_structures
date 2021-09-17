package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static void homework1() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = a;

        if (b > result) {
            result = b;
        }

        if (c > result) {
            result = c;
        }

        System.out.println(result);
    }

    public static void homework2() {
        int x = 5;
        int y = 7;
        int m;

        int result = 0;

        if (y < 0) {
            y = -y;
            m = -1;
        } else {
            m = 1;
        }

        while (y > 0) {
            if (y % 2 == 0) {
                x = x + x;
                y = y / 2;
            } else {
                result = result + x;
                y = y - 1;
            }

        }
        if (m < 0) {
            result = -result;
        }
        System.out.println(result);

    }
}
