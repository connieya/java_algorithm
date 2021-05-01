package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array04_answer {

    public static void main(String[] args) {

        int first = 1;
        int second = 1;
        int answer;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(first+" " +second+" ");
        for (int i =2 ; i< num; i++){

            answer = first + second;

            first = second;
            second = answer;
            System.out.print(answer +" ");

        }
    }
}
