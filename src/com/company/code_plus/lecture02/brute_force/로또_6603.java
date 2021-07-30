package com.company.code_plus.lecture02.brute_force;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 로또_6603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (true){
           int n = sc.nextInt();
           if (n==0) break;
           int [] arr = new int[n];
           for (int i=0; i<n; i++){
               arr[i] = sc.nextInt();
           }
           int d[] = new int[n];
           for (int i=0; i<n; i++){
               if (i<n-6) d[i] =0;
               else d[i] = 1;
           }
           ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
           do {
               ArrayList<Integer> cur = new ArrayList<>();
               for (int i=0; i<n; i++) {
                   if (d[i] == 1){
                       cur.add(arr[i]);
                   }
               }
               ans.add(cur);
           }while (next_permutation(d));
           Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
               @Override
               public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                   int n = o1.size();
                   int m = o2.size();
                   int i = 0;
                   while (i<n && i < m) {
                       int t1 = o1.get(i);
                       int t2 = o2.get(i);
                       if (t1 < t2) return -1;
                       else if (t1> t2) return 1;
                       i+= 1;
                   }
                   if (i == n && i!=m) return -1;
                   else if (i!=n && i == m) return 1;
                   return 0;
               }
           });
           for (ArrayList<Integer> v : ans) {
               for (int x : v){
                   System.out.print(x+" ");
               }
               System.out.println();
           }
           System.out.println();
       }

    }

    static boolean next_permutation(int d[]) {
        int i = d.length - 1;
        while (i > 0 && d[i - 1] >= d[i]) {
            i--;
        }

        if (i <= 0) return false;

        int j = d.length - 1;
        while (d[i - 1] >= d[j]) {
            j--;
        }
        swap(d,i-1,j);

        j = d.length -1;
        while (i<j){
            swap(d,i,j);

            i++;
            j--;
        }

        return true;
    }

    static void swap(int[] d, int a, int b) {
        int temp = d[a];
        d[a] = d[b];
        d[b] = temp;
    }
}
