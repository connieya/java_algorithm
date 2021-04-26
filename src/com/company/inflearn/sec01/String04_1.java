package com.company.inflearn.sec01;

public class String04_1 {

    public static void main(String[] args) {
        String exam = "HappyDay";

        String reverse = new StringBuilder(exam).reverse().toString();

        System.out.println(reverse);
    }
}
