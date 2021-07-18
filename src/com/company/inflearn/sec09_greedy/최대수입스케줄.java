package com.company.inflearn.sec09_greedy;

import java.util.*;

public class 최대수입스케줄 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][2];
        for (int i=0; i<N; i++){
            int money = sc.nextInt();
            int day = sc.nextInt();
            arr[i][0] = money;
            arr[i][1]= day;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                return o2[1]-o1[1];
            }
        });
        int max = arr[0][1];
        int sum=0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int j=0;
        for (int i = max; i>=1; i--){
            for (; j<N; j++){
                if (arr[j][1] < i) break;
                else {
                    pQ.offer(arr[j][0]);
                }
            }
            if (!pQ.isEmpty()) sum += pQ.poll();
        }
        System.out.println(sum);

    }
}
