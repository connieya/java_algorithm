package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요");

        String first_input = scanner.nextLine();
        char second_input = scanner.next().charAt(0);

        // 대 소문자 구분을 하지 않는 코드를 작성하지 않음
        String toUpperInput1 = first_input.toUpperCase();
        char toUpperInput = Character.toUpperCase(second_input);
        int count = 0;

        for (int i = 0; i < toUpperInput1.length(); i++) {

            if (toUpperInput == toUpperInput1.charAt(i)){
                count += 1;
            }

        }
        System.out.println("문자열 갯수는 = " + count);

    }
}
