package com.company.study;

public class Main {
    public static void main(String[] args) {
        char c = '0';
        c += 3;
        System.out.println(c); // 3
        System.out.println('9' == 57); // true
        System.out.println('3'+('3'-48)); // 54
        char ex = 0+'0'; // 아스키 코드 48
        char ex2 = 0; // 아스키 코드 0
        System.out.println(ex); // 0 출력
        System.out.println(ex2+'0'); // 48 출력 <- int 로 형변환
        int i = '5' + '4';  // <- char 형 사칙 연산은 int 형으로 자동 형 변호나 됨
        System.out.println(i); // 105
    }
}
