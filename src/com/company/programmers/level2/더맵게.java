package com.company.programmers.level2;

import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args) {
        int scoville[] =  {1, 2, 3, 9, 10, 12};
        int K = 7;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int sco : scoville){
            pq.offer(sco);
        }
        int answer = 0;
        while(pq.peek() < K) {
            if(pq.size() == 1) {
                System.out.println(-1);
                return;
            }
            int a = pq.poll();
            int b = pq.poll();

            int result = a + b*2;
            pq.offer(answer);

            answer++;
        }
        System.out.println(answer);
    }
}
