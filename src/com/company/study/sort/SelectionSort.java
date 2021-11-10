package com.company.study.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {7,5,9,0,3,1,6,2,4,8};

        for (int i=array.length-1; i>=0; i--) {
            int mid_index = i;
            for (int j=i-1; j >=0 ; j--) {
                if (array[mid_index] < array[j]) {
                    mid_index = j;
                }
            }
            int temp = array[mid_index];
            array[mid_index] = array[i];
            array[i] = temp;
        }
        for (int a : array){
            System.out.print(a+" ");
        }
    }
}
