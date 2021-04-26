package com.company.inflearn.sec01;

import java.util.Scanner;

class String04 {

     public void solution(String input[] , int num){


        String answer = "";
        for (int i=0; i<input.length; i++){
            for (int j=0; j<input[i].length(); j++){
                int len = input[i].length();
               answer += input[i].charAt(len -1 -j);
            }
            System.out.println(answer);
            answer ="";
        }

     }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while (num < 3 || num >20){
            System.out.println("3~20 사이 숫자만 입력하세요");
            num = sc.nextInt();
        }
        String input[] = new String[num];

        for (int i = 0; i< input.length; i++){
            input[i] = sc.next();
        }
        String04 s = new String04();

        s.solution(input ,num);


    }
}
