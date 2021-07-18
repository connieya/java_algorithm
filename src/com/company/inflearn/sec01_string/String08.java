package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String08 {

    public String solution(String str) {

        String s = str.toUpperCase();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            while (!Character.isAlphabetic(s.charAt(lt))) {
                lt++;
            }
            while (!Character.isAlphabetic(s.charAt(rt))) {
                rt--;
            }
            if (s.charAt(lt)!=s.charAt(rt)){
                return "NO";
            }
            lt++; rt--;


        }

        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String08 T = new String08();
        System.out.println(T.solution(input));

    }
}
