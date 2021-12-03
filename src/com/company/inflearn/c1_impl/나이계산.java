package com.company.inflearn.c1_impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나이계산 {
    static final int YEAR = 2019;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=  br.readLine();
        // 780316-2376152
        String sex = "M";
        int year = Integer.parseInt(str.substring(0,2));
        int index = str.indexOf("-")+1;
        char ch = str.charAt(index);

        if (ch== '1' || ch == '2'){
            year += 1899;
            if (ch == '2'){
                sex = "W";
            }
        }else{
            year += 1999;
            if (ch ==4) {
                sex = "W";
            }
        }
        System.out.println((YEAR-year)+" "+sex);

    }
}
