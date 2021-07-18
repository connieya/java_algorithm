package com.company.inflearn.sec04_hash;

import java.util.HashMap;
import java.util.Scanner;

public class Hash1 {

    public char solution(int n , char[] arr){
        HashMap<Character ,Integer> map = new HashMap<>();

        System.out.println(arr);
        char answer = ' ';
        for (char x : arr){
            System.out.println("x = "+x);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = Integer.MAX_VALUE;
        for (char key : map.keySet()){
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }

        Hash1 h = new Hash1();
        System.out.println(h.solution(n,arr));
    }
}
