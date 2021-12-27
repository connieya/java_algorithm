package com.company.study2021.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최대수입스케줄 {
    static int N;
    static int companyList[][];
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        companyList = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            companyList[i][0] = a;
            companyList[i][1] = b;
        }
        Arrays.sort(companyList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        dfs();
        System.out.println(answer);

    }

    public static void dfs() {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int max = companyList[0][1];
        int j =0;
        for (int i = max; i >= 1; i--) {
            for (; j < N; j++) {
                if (companyList[j][1] < i) {
                    break;
                }
                pQ.offer(companyList[j][0]);
            }
            if (!pQ.isEmpty()){
                answer += pQ.poll();
            }
        }
    }
}
