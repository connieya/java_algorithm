package com.company.dongbinbook.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 위상정렬 {
    // 노드의 개수(V)와 간선의 개수(E)
    // 노드의 개수는 최대 100_000 개라고 가정
    public static int v,e;
    // 모든 노드에 대한 진입 차수는 0으로 초기화
    public static int [] indegree = new int[100_001];
    public static ArrayList<ArrayList<Integer>> graph  = new ArrayList<>();

    // 위상 정렬 함수
    public static void topologySort() {
        ArrayList<Integer> result = new ArrayList<>(); // 알고리즘 수행 결과를 담을 리스트
        Queue<Integer> queue = new LinkedList<>(); // 큐 라이브러리 사용

        // 처음 시작할 때는 진입 차수가 0인 노드를 큐에 삽입
        for (int i=1; i<=v; i++){
            if (indegree[i] ==0) {
                queue.offer(i);
            }
        }

        //큐가 빌 때 까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 원소 꺼내기
            int now = queue.poll();
            result.add(now);
            for (int i : graph.get(now)){
                indegree[i] -= 1;
                if (indegree[i] == 0) {
                    queue.offer(i);
                }
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();

        // 그래프 초기화
        for (int i=0; i<=v; i++) {
            graph.add(new ArrayList<>());
        }

        // 방향 그래프의 모든 간선 정보를 입력 받기
        for (int i=0; i<e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);// 정점 A에서 B로 이동 가능
            // 진입 차수를 1 증가
            indegree[b] += 1;
        }
        topologySort();
    }
}
