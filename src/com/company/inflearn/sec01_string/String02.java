package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        char[] chars = input.toCharArray();
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);


            if (Character.isLowerCase(c) == true){
                chars[i] =Character.toUpperCase(c);
            }else{
                chars[i] = Character.toLowerCase(c);
            }
        }

        System.out.println(chars);
    }
}
