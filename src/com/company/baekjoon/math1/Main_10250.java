package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int x =1, y =1 ,count =1;
            for (int i=0; i<h*w; i++){
                if (x>h){
                    x =1;
                    y+=1;
                }
                if (n==count){
                    break;
                }
                x =x+1; count+=1;
            }
            StringBuilder sb = new StringBuilder();
            if (y<10){
                sb.append(x).append(0).append(y);
                System.out.println(sb);
            }else{
                sb.append(x).append(y);
                System.out.println(sb);
            }


        }
    }
}
