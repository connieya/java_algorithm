package com.company.inflearn.sec03;

import java.util.ArrayList;
import java.util.Scanner;

public class Tow2 {
    public ArrayList<Integer> solution(int n1, int n2, int arr[], int arr2[]) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=n1-1; i>0; i--){
            for (int j=0; j<i; j++){

            if (arr[j] > arr[j+1]){
                int tmp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = tmp;
            }
            }
        }

        for (int i=n2-1; i>0; i--){
            for (int j=0; j<i; j++){

                if (arr2[j] > arr2[j+1]){
                    int tmp = arr2[j+1];
                    arr2[j+1] = arr2[j];
                    arr2[j] = tmp;
                }
            }
        }
        for (int i =0; i<n1; i++){
            for (int j=0; j<n2; j++){
                if (arr[i]==arr2[j]){
                    answer.add(arr[i]);
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Tow2 T = new Tow2();

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
