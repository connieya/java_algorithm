package com.company.inflearn.sec04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hash3_answer {

    public ArrayList<Integer> solution(int n, int k, int array[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();


        for (int i=0; i<k-1; i++){
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }

        int lt=0;
        for (int rt = k-1; rt< n; rt++){
            map.put(array[rt],map.getOrDefault(array[rt],0)+1);
            answer.add(map.size());
            map.put(array[lt], map.get(array[lt])-1);
            if (map.get(array[lt]) == 0){
                map.remove(array[lt]);
            }
            lt++;

        }

        return answer;


    }

    public static void main(String[] args) {
        Hash3_answer H = new Hash3_answer();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : H.solution(n,k,arr)){
            System.out.print(x +" ");
        }

    }
}
