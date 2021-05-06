package com.company.inflearn.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tow2_answer {
    public ArrayList<Integer> solution(int n1, int n2, int arr[], int arr2[]) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr2);


        int p1 = 0 ,p2 =0;
        while (p1<n1 && p2 < n2){
            if (arr[p1] < arr2[p2]){
                p1++;
            }else if(arr[p1] > arr2[p2]){
                p2++;
            }else {
                answer.add(arr[p1++]);
                p2++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Tow2_answer T = new Tow2_answer();

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int arr[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : T.solution(n1, n2, arr, arr2)) {
            System.out.print(x + " ");
        }


    }
}