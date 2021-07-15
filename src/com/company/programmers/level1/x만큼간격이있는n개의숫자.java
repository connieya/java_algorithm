package com.company.programmers.level1;

import java.util.Scanner;

public class x만큼간격이있는n개의숫자 {
    static long[] solution(int x , int n){
        long[] answer = new long[n];
        long v =x;
        for (int i=0; i<n; i++){
            answer[i] = v*(i+1);

        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        for(long i : solution(x,n)){
            System.out.print(i+" ");
        }
    }
}
