package com.company.programmers.level1;

import java.util.Scanner;

public class 숫자문자열과영단어_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String [] alphabet = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i=0; i<alphabet.length; i++){
            str =  str.replaceAll(alphabet[i], Integer.toString(i));
        }
        System.out.println(Integer.parseInt(str));


    }
}
