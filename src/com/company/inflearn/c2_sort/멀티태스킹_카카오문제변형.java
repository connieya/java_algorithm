package com.company.inflearn.c2_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Work {
    int num;
    int second;

    public Work(int num, int second) {
        this.num = num;
        this.second = second;
    }
}

public class 멀티태스킹_카카오문제변형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k =0  , cnt = 0;
        Queue<Work> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            queue.offer(new Work(i, Integer.parseInt(br.readLine())));
        }
        k = Integer.parseInt(br.readLine());
        while (cnt < k) {
            cnt++;
            if (queue.isEmpty()){
                break;
            }
            Work current = queue.poll();
            current.second--;
            if (current.second > 0){
                queue.offer(current);
            }
        }
        if (queue.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(queue.peek().num);
        }
    }
}
