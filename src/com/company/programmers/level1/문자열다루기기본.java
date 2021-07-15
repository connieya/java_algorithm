package com.company.programmers.level1;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        String s = "a234";
        boolean answer = true;
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException e){
            answer = false;
        }

        System.out.println(answer);
    }
}
