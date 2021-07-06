package com.company.inflearn.sec02;

import java.util.Scanner;
public class 뒤집은소수 {
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
        String array[] = new String[N];
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++){
            array[i] = sc.next();
            String s = new StringBuilder(array[i]).reverse().toString();
            if (!prime[Integer.parseInt(s)]){
                sb.append(Integer.parseInt(s)+" ");
            }
        }
        System.out.println(sb);

    }
}
