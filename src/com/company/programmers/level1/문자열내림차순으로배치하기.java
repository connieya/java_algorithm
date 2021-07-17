package com.company.programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        Character [] c =  new Character[s.length()];
        int i=0;
        for (char ch :s.toCharArray()){
            c[i++] = ch;
        }
        for (int j=0; j<c.length-1; j++){
            int index = j;
            for (int k=j+1; k<c.length; k++){
                if (c[index]<c[k]){
                    index =k;
                }
            }
            char temp = c[j];
            c[j] =c[index];
            c[index] = temp;
        }
    }
}
