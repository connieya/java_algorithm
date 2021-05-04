package com.company.inflearn.sec03;

import java.util.Scanner;

public class Tow5 {

    public int solution(int n){

        int answer = 0;

        int sum = 0;
        int lt = 1;
        for (int i=1; i<= (n/2)+1; i++){
            sum += i;
            if (sum == n){
                answer++;
                sum -= lt;
                lt++;
            }
            while (sum >= n){
                if (sum == n) answer++;
                sum -= lt;
                lt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Tow5 T = new Tow5();
        System.out.println(T.solution(num));
    }
}
