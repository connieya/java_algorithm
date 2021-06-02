package com.company.code_plus.lecture02.permutation;

import java.util.Scanner;

public class Main_10971 {
    public static boolean next_permuataion(int d[]){
        int i = d.length-1;
        while (i>0 && d[i-1]>d[i]){
            i -=1;
        }
        if (i<=0){
            return false;
        }
        int j = d.length-1;
        while (d[i-1]>d[j]){
            j-=1;
        }

        int temp = d[j];
         d[j] = d[i-1];
         d[i-1] = temp;

         j = d.length-1;
         while (i<j){
             temp = d[j];
             d[j] = d[i];
             d[i] = temp;
             i+=1;
             j-=1;
         }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][ ] =  new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int d[] = new int[n];
        for (int i=0; i<n; i++){
            d[i] = i;
        }

        int ans =Integer.MAX_VALUE;
        do {
            boolean ok = true;
            int sum = 0;
            for (int i=0; i<n-1; i++){
                if (a[d[i]][d[i+1]] == 0){
                    ok = false;
                }else {
                    sum += a[d[i]][d[i+1]];
                }
            }
            if (ok && a[d[n-1]][d[0]] !=0){
                sum += a[d[n-1]][d[0]];
                if (ans > sum){
                    ans = sum;
                }
            }
        }while (next_permuataion(d));

        System.out.println(ans);
    }
}
