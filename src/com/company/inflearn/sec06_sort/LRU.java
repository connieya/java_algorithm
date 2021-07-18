package com.company.inflearn.sec06_sort;

import java.util.ArrayList;
import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int answer[] = new int[s];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<n; i++){
            int v = sc.nextInt();
            if (list.contains(v)){
                list.remove(v);
                list.add(0,v);
            }else{
                list.add(0,v);
            }
        }
        for (int i=0; i<s; i++){
            answer[i] = list.get(i);
        }
        for (int x : answer){
            System.out.print(x+" ");
        }
    }
}
