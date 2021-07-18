package com.company.inflearn.sec01_string;

import java.util.Scanner;

class String05 {
     public String solution(String value){

         char[] chars = value.toCharArray();
         int lt  = 0;
         int rt = chars.length-1;

         while (lt < rt){

             while (chars[lt] < 65 || chars[lt] >122 || (90< chars[lt] && chars[lt] < 97)){
                 lt++;
             }
             while (chars[rt] < 65 || chars[rt] >122 || (90< chars[rt] && chars[rt] < 97)){
                 rt--;
             }

             char tmp = chars[rt];
             chars[rt] = chars[lt];
             chars[lt] = tmp;
             lt++;
             rt--;
         }

         String answer = String.valueOf(chars);

         return answer;

     }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String input = kb.next();

        String05 s = new String05();
        System.out.println(s.solution(input));

    }
}
