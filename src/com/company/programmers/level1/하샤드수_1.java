package com.company.programmers.level1;

import java.util.Scanner;

public class 하샤드수_1 {
    static boolean solution(int n){
       int value = n;
       int sum = 0;
       while (value!=0){
           sum += value%10;
           value /= 10;
       }
       return n%sum ==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));

    }
}
