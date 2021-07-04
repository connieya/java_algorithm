package com.company.baekjoon.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class location{
    int x ,y;
    public location(int x, int y){
        this.x =x;
        this.y =y;
    }
}
public class 좌표정렬하기_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        location [] lc = new location[n];
        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            lc[i] = new location(x,y);
        }
        Arrays.sort(lc, new Comparator<location>() {
            @Override
            public int compare(location o1, location o2) {
                if (o1.x == o2.x){
                    return o1.y - o2.y;
                }else {

                    return o1.x - o2.x;
                }
            }
        });
        for (location c : lc){
            System.out.println(c.x+" "+c.y);
        }

    }
}
