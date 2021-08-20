package com.company.dongbinbook.greedy;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int change [] = {500,400,100};
        int count = 0;
        for (int i = 0; i< change.length; i++) {
            count += money / change[i];
            money %= change[i];
        }
        System.out.println(count);
    }
}
