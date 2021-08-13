package com.company.programmers.level2;

public class 숫자의표현 {
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;
        int count = 0;
        int j = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            while (sum >= n) {
               if (sum==n) count++;
               sum -=j;
               j++;
            }
        }
        System.out.println(count);
    }
}
