package com.company.inflearn.sec06;

public class 선택정렬 {
    public static void main(String[] args) {
        int arr[]  = {3,17,25,11,7,23,15};
        for (int i=0; i<arr.length-1; i++){
            int index = i;
            for (int j=i+1; j<arr.length;j++){
                if (arr[index]>arr[j]){
                    index = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

        }

        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
