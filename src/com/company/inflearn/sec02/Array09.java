package com.company.inflearn.sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array09 {

    public int solution(int num , int[][]arr){


        ArrayList<Integer> answer = new ArrayList<>();

        int diagonal = 0;
        int diagonal2 = 0;
        for (int i=0; i<num; i++){
            int row = 0, column = 0 ;

            diagonal+= arr[i][i];
            diagonal2+= arr[num-1-i][i];

            for (int j=0; j<num; j++){
                row += arr[i][j];
                column += arr[j][i];
            }
            answer.add(row);
            answer.add(column);
        }
        answer.add(diagonal);
        answer.add(diagonal2);

        int max = answer.get(0);
        for (int z=0; z<answer.size(); z++){
            if (max < answer.get(z)) max = answer.get(z);
        }


        return max;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[][] = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        }

        Array09 A = new Array09();
        System.out.println(A.solution(n,array));




    }

}
