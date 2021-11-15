package com.company.good;

public class 자리수구하기 {
    public static void main(String[] args) {
        String numbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int num = 12542;
        while (num > 0) {
            System.out.print(num % 10 + " ");
            num /= 10;
        }
        // 2 4 5 2 1
        System.out.println();
        // 각 자리 숫자 영어로 이어 붙이기
        String str = "";
        num = 67892;
        while (num > 0) {
            str = numbers[num % 10] +" " + str ;
            num /= 10;
        }
        System.out.println(str);
        // six seven eight nine two

    }
}

