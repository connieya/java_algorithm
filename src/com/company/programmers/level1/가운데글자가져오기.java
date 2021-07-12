package com.company.programmers.level1;

import java.util.Scanner;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.substring((str.length()-1)/2, str.length()/2+1));
    }
}
