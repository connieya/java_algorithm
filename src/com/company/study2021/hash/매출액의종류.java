package com.company.study2021.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 매출액의종류 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Map<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        List<Integer> answer = new ArrayList<>();
        for (int  i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i] ,0)+1);
        }
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());

            map.put(arr[lt] , map.get(arr[lt])-1);
            if (map.get(arr[lt]) == 0 ) {
                map.remove(arr[lt]);
            }
            lt++;
        }
        for (int i : answer){
            System.out.print(i+" ");
        }
    }
}
