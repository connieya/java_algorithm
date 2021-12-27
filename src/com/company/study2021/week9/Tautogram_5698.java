package com.company.study2021.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tautogram_5698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str = br.readLine().toLowerCase();
            if (str.equals("*")){
                break;
            }
            String arr [] = str.split(" ");
            char ch = arr[0].charAt(0);
            boolean flag = true;
            for (String a :arr){
                if (ch != a.charAt(0)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Y");
                continue;
            }
            System.out.println("N");
        }
        br.close();
    }
}
