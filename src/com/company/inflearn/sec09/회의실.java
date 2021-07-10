package com.company.inflearn.sec09;

import java.util.Arrays;
import java.util.Scanner;

public class 회의실 {
    static class Time implements Comparable<Time>{
        int start, end;
        public Time(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.end == o.end) return this.start - o.start;
            else return this.end - o.end;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time [] t = new Time[n];
        for (int i=0; i<n; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            t[i] = new Time(s,e);
        }
        Arrays.sort(t);

        int et =0;
        int count =0;
        for (Time ob : t){
            if (ob.start >= et){
                count++;
                et = ob.end;
            }
        }
        System.out.println(count);
    }
}
