package com.company.code_plus.lecture01.math1;

import java.util.Scanner;

public class Main_6588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){

            int n = sc.nextInt();
            if (n== 0) break;
            boolean arr[] = new boolean[n+1];
            for (int i=2; i<=n; i++){
                if (arr[i]) continue;

                for (int j=i+i; j<=n; j +=i){
                    arr[j] = true;
                }
            }
            for (int i=3; i<=n; i++){
                if (arr[i] == false){
                    System.out.println(i);
                }
            }






        }
    }
}
