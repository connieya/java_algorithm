package com.company.inflearn.sec06;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main5_2 {


    public String solution(int n, int arr[]) {

        String answer = "U";
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        Set<Integer> integers = map.keySet();


        return answer;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Main5_2 T = new Main5_2();
        System.out.println(T.solution(n, arr));
    }
}
