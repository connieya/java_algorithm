package com.company.study.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 돌다리_12761 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] visited = new int[100_001];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = 1;
        while (!queue.isEmpty()){
            int current = queue.poll();
            if (current == M){
                break;
            }
            if (current+1 <=100_000 && visited[current+1] == 0){
                queue.offer(current+1);
                visited[current+1] = visited[current]+1;
            }
            if (current-1 >= 0 && visited[current-1] == 0){
                queue.offer(current-1);
                visited[current-1] = visited[current]+1;
            }
            if (current+A <=100_000 && visited[current+A] == 0){
                queue.offer(current+A);
                visited[current+A] = visited[current] +1;
            }
            if (current+B <=100_000 && visited[current+B] == 0){
                queue.offer(current+B);
                visited[current+B] = visited[current] +1;
            }
            if (current*A <=100_000 && visited[current*A] == 0){
                queue.offer(current*A);
                visited[current*A] = visited[current] +1;
            }
            if (current*B <=100_000 && visited[current*B] == 0){
                queue.offer(current*B);
                visited[current*B] = visited[current] +1;
            }
            if (current-A >=0 && visited[current-A] == 0){
                queue.offer(current-A);
                visited[current-A] = visited[current] +1;
            }
            if (current-B >=0 && visited[current-B] == 0){
                queue.offer(current-B);
                visited[current-B] = visited[current] +1;
            }
        }
        System.out.println(visited[M]-1);
    }
}
