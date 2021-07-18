package com.company.inflearn.sec10_dp;

import java.util.Arrays;
import java.util.Scanner;

public class 가장높은탑쌓기 {
    static class bricks implements Comparable<bricks>{
        int width, height , weight;
        public bricks(int width, int height, int weight){
            this.width  =width;
            this.height = height;
            this.weight = weight;
        }
        @Override
        public int compareTo(bricks o) {
            return o.width -this.width;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bricks[] array = new bricks[n];
        int dy[] = new int[n];
        for (int i=0; i<n; i++){
            int width = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            array[i] = new bricks(width,height,weight);
        }

        Arrays.sort(array);
        int answer =0;
       for (int i=0; i<n; i++){
           int max = 0;
           for (int j=i-1; j>=0; j--){
                if (array[j].weight >array[i].weight && dy[j]>max){
                   max = dy[j];
                }
           }
           dy[i] = max+array[i].height;
           answer = Math.max(answer,dy[i]);
       }

        System.out.println(answer);
    }

}
