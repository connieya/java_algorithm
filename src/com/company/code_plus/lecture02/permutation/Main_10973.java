package com.company.code_plus.lecture02.permutation;

import java.util.Scanner;

public class Main_10973 {
    public static boolean prev_permutation(int []a){
        int i = a.length-1;
        while (i>0 && a[i]> a[i-1]){
            i -= 1;
        }
        if (i<=0){
            return false;
        }

        int j = a.length-1;
        while (a[i-1]<a[j]){
            j -=1;
        }
        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i<j){
             temp = a[j];
             a[j] = a[i];
             a[i] = temp;
             i +=1;
             j -=1;
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        if (prev_permutation(a)){
            for (int x : a){
                System.out.print(x+" ");
            }

        }else {
            System.out.println("-1");
        }
    }
}
