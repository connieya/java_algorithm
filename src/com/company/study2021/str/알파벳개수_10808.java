package com.company.study2021.str;

import java.util.Scanner;

public class 알파벳개수_10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int alphabet[] = new int[26];
        char[] strArray = S.toCharArray();
        for (char c : strArray) {
            alphabet[c-97]++;
        }
        for (int a : alphabet){
            System.out.print(a+" ");
        }

    }
}
