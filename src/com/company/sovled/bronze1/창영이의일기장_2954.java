package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 창영이의일기장_2954 {
   static char vowel[] = {'a','e','i','o','u'};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        int len = str.length() , i;
        StringBuilder original = new StringBuilder();
        for (i=0; i<len; i++){
            char ch = str.charAt(i);
            for (int j=0; j<5; j++){
                if (ch == vowel[j]){
                    i +=2;
                    break;
                }
            }
            original.append(ch);
        }
        System.out.println(original);
    }
}
