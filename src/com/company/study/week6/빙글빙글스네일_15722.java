package com.company.study.week6;

import java.util.Scanner;

public class 빙글빙글스네일_15722 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        int y = 0;
        int move = 1;
        int second = 0;
        boolean flag = true;
        loop:while (second < n) {
            if (flag) {
                for (int i = 0; i < move; i++) {
                    if (second == n) {
                        break loop;
                    }
                    ++y;
                    second +=1;

                }
                for (int i = 0; i < move; i++) {
                    if (second == n) {
                        break loop;
                    }
                    ++x;
                    second +=1;

                }
            }else {
                for (int i = 0; i < move; i++) {
                    if (second == n){
                        break loop;
                    }
                    --y;
                    second +=1;

                }
                for (int i = 0; i < move; i++) {
                    if (second == n) {
                        break loop;
                    }
                    --x;
                    second +=1;

                }
            }
            flag = !flag;
            ++move;
        }
        System.out.println(x + " " + y);
    }
}
