package com.company.inflearn.sec03;

import java.util.Scanner;

public class Tow4 {

    public int solution(int n , int m , int arr[]){
        int count =0;


        for (int i=0; i<n; i++){
            int sum=0;
            for (int j=i; j<n; j++){
                sum+= arr[j];
                if (sum == m){
                    count++;
                    break;

                }else if(sum > m){
                    break;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int m = sc.nextInt();

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Tow4 T = new Tow4();

        System.out.println(T.solution(n,m,arr));


    }
}
