package com.company.inflearn.sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array06_answer {
    public ArrayList<Integer> solution(int n , int [] arr){

        ArrayList<Integer> answer = new ArrayList<>();
        for (int j=0; j<n; j++){
            int tmp = arr[j];
            int res = 0;
            while (tmp > 0){
                int t = tmp%10;
                res = res*10 + t;
                tmp = tmp/10;
            }
            if (isPrime(res)) answer.add(res);

        }
        return answer;

    }
    public static void main(String[] args) {

        Array06_answer A = new Array06_answer();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int [] array = new int[num];
        for (int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        for (int x : A.solution(num, array)){
            System.out.print(x+" ");
        }

    }
    public static boolean isPrime(int n){
        if (n==4 || n==1) return false;
        for (int z=2; z<n/2; z++){
            if (n % z ==0){
                return false;
            }
        }
        return true;
    }
}
