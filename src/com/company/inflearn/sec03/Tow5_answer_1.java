package com.company.inflearn.sec03;

import java.util.Scanner;

public class Tow5_answer_1 {
    public int solution(int n){
        int answer = 0 ,cnt =1;
        n--;
        while (n>0){
            cnt++;
            n = n-cnt;
            if (n%cnt ==0) answer++;
        }



        return answer;
    }

    public static void main(String[] args) {
        Tow5_answer_1 T = new Tow5_answer_1();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.solution(n));
    }

}
