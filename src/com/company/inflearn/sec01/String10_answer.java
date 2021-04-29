package com.company.inflearn.sec01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class String10_answer {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == c){
                p =0;
                answer[i] = p;
            }else {
                p++;
                answer[i] = p;
            }
        }
        // 왼쪽으로 읽었 을 때 떨어진 거리

        p  = 1000;
        for (int i= str.length()-1; i>=0; i--){
            if (str.charAt(i) == c){
                p =0;
            }else {
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        char input2 = sc.next().charAt(0);

        String10_answer S = new String10_answer();
        for (int x : S.solution(input1, input2)){
            System.out.print(x +" ");
        }

    }
}
