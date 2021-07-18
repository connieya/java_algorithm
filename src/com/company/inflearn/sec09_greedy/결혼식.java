package com.company.inflearn.sec09_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 결혼식 {
    static class Time implements Comparable<Time>{
        int time;
        char state;
        Time(int time, char state){
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time) return this.state-o.state;
            return this.time-o.time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Time> time = new ArrayList<>();
        for (int i=0; i<N; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            time.add(new Time(start,'s'));
            time.add(new Time(end,'e'));
        }
        Collections.sort(time);
        int cnt =0;
        int answer = Integer.MIN_VALUE;
        for (Time ob : time){
            if (ob.state =='s') cnt++;
            else cnt--;
            answer= Math.max(answer,cnt);
        }
        System.out.println(answer);

    }
}
