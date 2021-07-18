package com.company.inflearn.sec01_string;

import java.util.*;

public class String10_1 {
    public String  solution(String str, char c) {

        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        int p = 1000;
        int p1 = 1000;
        int len = str.length()-1;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == c) {
                p = 0;
                num1.add(p);
                p++;
            } else {
                num1.add(p);
                p++;
            }

            if (str.charAt(len-i) == c){
                p1 = 0;
                num2.add(p1);
                p1++;
            }else{
                num2.add(p1);
                p1++;
            }
        }
        Collections.reverse(num2);
        String answer ="";
        for (int i=0; i< num1.size(); i++){
            int min = num1.get(i);
            if (min >num2.get(i)){
                min = num2.get(i);
            }


            answer += min+" ";
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        char input2 = sc.next().charAt(0);

        String10_1 S = new String10_1();
        System.out.println(S.solution(input1, input2));

    }
}
