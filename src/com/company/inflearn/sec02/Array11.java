package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array11 {

    public int solution(int num , int array[][]){
        int answer = 0;
        //학생
        for (int i=0; i<num; i++){
            //학년
            for (int j=0; j<5; j++){
                answer= array[j][i];
            }
        }



        return  answer;
    }



    public static void main(String[] args) {

        Array11 A = new Array11();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int array[][] = new int[num][5];

        for (int i=0; i<num; i++){
            for (int j=0; j<5; j++){
                array[i][j] = sc.nextInt();
            }
        }
    }
}
