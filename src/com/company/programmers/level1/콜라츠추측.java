package com.company.programmers.level1;

import java.util.Scanner;

public class 콜라츠추측 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = n;
        int count =-1;
        for (int i=0; i<500; i++){
            if (num ==1){
                count = i;
                break;
            }
            num = (num%2==0) ? num/2 : num*3+1;
        }
        System.out.println(count);
    }
}
