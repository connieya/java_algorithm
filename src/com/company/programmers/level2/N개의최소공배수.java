package com.company.programmers.level2;

public class N개의최소공배수 {
    public static void main(String[] args) {
        int arr[] = {2, 6, 8, 14};
        int gcd = gcd(arr[0], arr[1]);
        int lcd = (arr[0] * arr[1]) / gcd;
        // 두 수의 곱을 최대 공약수로 나누면 최소 공배수이다.
        for (int i = 2; i < arr.length; i++) {
            gcd = gcd(lcd, arr[i]);
            lcd = (lcd * arr[i]) / gcd;

        }
        System.out.println(lcd);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
