package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array12 {

    public int solution(int n, int m , int array[][]){
        int answer =0;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                int cnt = 0;
                for (int k=0; k<m; k++){
                    int pi = 0 , pj=0;
                    for (int s=0; s<n; s++){
                        if (array[k][s] == i) pi =s;
                        if (array[k][s] == j) pj = s;

                    }
                    if (pi<pj) cnt++;
                }
                if (cnt ==m){
                    answer++;
                }
            }
        }


        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int array[][] = new int[m][n];

        for (int i =0; i< m; i++){
            for (int j=0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        }

        Array12 A = new Array12();
        System.out.println(A.solution(n,m,array));

    }
}
