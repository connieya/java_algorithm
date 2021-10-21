package com.company.study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 회전하는큐_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }
        int count = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int index = Integer.parseInt(st.nextToken());
            int target_index = queue.indexOf(index);
            int half_index;

            if (queue.size() % 2 == 0 ) {
                half_index = queue.size() /2  -1;
            } else {
                half_index = queue.size() /2;
            }


            if (target_index <= half_index) { // 2번 연산 수행
                for (int i=0; i< target_index; i++) {
                    int temp = queue.pollFirst();
                    queue.offerLast(temp);
                    count++;
                }
            }else { // 3번 연산수행
                for (int i=0; i< (queue.size() - target_index); i++) {
                    int temp = queue.pollLast();
                    queue.offerFirst(temp);
                    count++;
                }
            }
            queue.poll();
        }
        System.out.println(count);
    }
}
