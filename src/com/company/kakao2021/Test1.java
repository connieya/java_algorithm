package com.company.kakao2021;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {


        int answer = 0;

        String s = "one4seveneight";
        String tmp = "";
        String tmp2 = "";



        for (char c : s.toCharArray()){
            if (!Character.isAlphabetic(c)) tmp +=c;
            else {
                tmp2+= c;
                switch (tmp2){
                    case "one":
                        tmp+=1;
                        tmp2 ="";
                        break;
                    case "two":
                        tmp+=2;
                        tmp2 ="";
                        break;
                    case "three":
                        tmp+=3;
                        tmp2 ="";
                        break;
                    case "four":
                        tmp+=4;
                        tmp2 ="";
                        break;
                    case "five":
                        tmp+=5;
                        tmp2 ="";
                        break;
                    case "six":
                        tmp+=6;
                        tmp2 ="";
                        break;
                    case "seven":
                        tmp+=7;
                        tmp2 ="";
                        break;
                    case "eight":
                        tmp+=8;
                        tmp2 ="";
                        break;
                    case "nine":
                        tmp+=9;
                        tmp2 ="";
                        break;
                }

            }

        }
        answer = Integer.parseInt(tmp);
        System.out.println(answer);






    }



}
