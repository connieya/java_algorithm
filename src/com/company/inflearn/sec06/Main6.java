package com.company.inflearn.sec06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main6 {


    public ArrayList<Integer> solution(int n , int arr[]) {
        ArrayList<Integer> answer = new ArrayList<>();

        int tmp[] = arr.clone();
        Arrays.sort(tmp);

        for (int j=0; j<n; j++){
            if (tmp[j] != arr[j]){
                answer.add(j+1);
            }
        }


        return answer;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Main6 M = new Main6();
        for (int x : M.solution(n,arr) ){
            System.out.print(x + " ");
        }

    }
}
