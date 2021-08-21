package com.company.dongbinbook.implement;

import java.util.Scanner;

public class 상하좌우_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        String [] direction = {"L","R","U","D"};
        int [] dx = {0,0,-1,1};
        int [] dy = {-1,1,0,0};
        int x = 1,y = 1;
        int nx =0,ny=0;
        for (String i : input) {
            for (int j=0; j<4; j++){
                if (i.equals(direction[j])){
                     nx = x + dx[j];
                     ny = y + dy[j];
                }
                if (nx >=1 && nx<=n && ny >=1 && ny<=n) {
                    x = nx;
                    y = ny;
                }
            }
        }
        System.out.println(x+" "+y);
    }
}
