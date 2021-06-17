package com.company.baekjoon;

import java.util.Scanner;

public class Main_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = new int[8];
        for (int i=0; i<data.length; i++){
            data[i]= sc.nextInt();
        }
        String output = "";
        for (int i=0; i <data.length-1; i++){
            if (data[i]- data[i+1] ==1){
                output = "descending";
            }else if(data[i]-data[i+1] == -1){
                output = "ascending";
            }else {
                output ="mixed";
                break;
            }
        }
        System.out.println(output);
    }
}
