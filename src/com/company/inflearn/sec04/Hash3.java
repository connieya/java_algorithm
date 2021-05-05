package com.company.inflearn.sec04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hash3 {

    public ArrayList<Integer> solution(int n, int k , int array[]){

        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i =0; i<=n-k; i++){
            for (int j= i; j<k+i; j++){
                map.put(array[j],array[j]);
            }
            answer.add(map.size());
            map.clear();
        }


        return  answer;
    }

    public static void main(String[] args) {
        Hash3 H = new Hash3();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int []arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int x : H.solution(n,k,arr)){
            System.out.print(x+" ");
        }

    }
}
