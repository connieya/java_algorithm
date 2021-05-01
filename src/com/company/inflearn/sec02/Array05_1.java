package com.company.inflearn.sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array05_1 {
    public static void main(String[] args) {

        ArrayList<Boolean> primeList;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n<=1) return;

        primeList = new ArrayList<Boolean>(n+1);

        // 0번째와 1번째를 소수 아님으로 처리
        primeList.add(false);
        primeList.add(false);

        // 2~ n까지 소수로 섫정
        for (int i=2; i<=n; i++){
            primeList.add(i,true);
        }

        // 2부터 ~ i*i  <= n
        // 각각의 배수들을 지원간다.
        for (int i=2; (i*i)<=n; i++){
            if (primeList.get(i)){
                for (int j= i*i; j<=n; j+=i){
                    primeList.set(j,false);
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        sb.append("{");
        for (int i=0; i<=n; i++){
            if (primeList.get(i)){
                sb.append(i);
                sb.append(",");
            }
        }
        sb.setCharAt(sb.length()-1,'}');
        System.out.println(sb.toString());
    }
}
