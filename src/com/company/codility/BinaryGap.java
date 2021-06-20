package com.company.codility;

import java.util.Scanner;

public class BinaryGap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (n>0){
            sb.append(n%2);
            n /= 2;
        }
        int start = sb.indexOf("1");
        int end = sb.lastIndexOf("1");
        String newBinary = sb.substring(start,end+1);
        String [] splits = newBinary.split("1");
        int max =0;
        for (String s : splits){
            if(s.length()>max){
                max = s.length();
            }
        }
        System.out.println(max);
    }
}
