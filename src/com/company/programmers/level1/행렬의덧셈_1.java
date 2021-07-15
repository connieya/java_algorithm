package com.company.programmers.level1;

public class 행렬의덧셈_1 {
    public static void main(String[] args) {
        int arr1[][] = {{5,2}, {2,3}};
        int arr2[][] = {{3,1}, {3,6}};

        int answer[][] = {};
        answer = arr1;
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                answer[i][j]+=arr2[i][j];
            }
        }

        for (int[]a : answer){
           for (int i : a){
               System.out.print(i+" ");
           }
            System.out.println();
        }

    }
}
