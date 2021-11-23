package com.company.good;

public class 진수변환 { // 2진수  => 10진수
    public static void main(String[] args) {
        String str = "1001001";
        System.out.println(Integer.parseInt(str,2));
    }
}
