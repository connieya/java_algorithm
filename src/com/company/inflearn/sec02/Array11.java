package com.company.inflearn.sec02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Array11 {

    public int solution(int num, int array[][]) {

        ArrayList<Integer> ex = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        int cnt = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            for (int z = 0; z < 5; z++) {

                int student = array[i][z];
                for (int j = 0; j < num; j++) {
                    if (z != j && student == array[j][z] && !ex.contains(j)) {
                        cnt++;
                        ex.add(j);
                    }
                }

            }
             if (min < cnt) {
                hash.put(i, cnt);
                min = cnt;
            }

        }


        return min + 1;
    }


    public static void main(String[] args) {

        Array11 A = new Array11();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int array[][] = new int[num][5];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(A.solution(num, array));
    }
}
