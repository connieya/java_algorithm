package com.company.programmers.level1;

import java.util.Scanner;

public class 하샤드수 {
    static boolean solution(int n){
        String[] temp = String.valueOf(n).split("");
        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }
        return n%sum ==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));
    }
}
