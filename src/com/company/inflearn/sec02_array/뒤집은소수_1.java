package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 뒤집은소수_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean []prime = new boolean[100001];
        prime[1] = true;
        for (int i=2; i*i< prime.length; i++){
            if (prime[i]) continue;
            for (int j=i+i; j<prime.length; j+=i){
                prime[j] = true;
            }
        }
        int N = sc.nextInt();
        int array[] = new int[N];
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++){
            array[i] = sc.nextInt();
            int res=0;
            while (array[i]>0){
                int t = array[i]%10;
                res= res*10+t;
                array[i] = array[i]/10;
            }
            if (!prime[res]){
                sb.append(res+" ");
            }
        }
        System.out.println(sb);

    }
}
