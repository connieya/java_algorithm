package com.company.study2021.sort;

public class QuickSort_ndb {
    public static void main(String[] args) {
        int [] arr = {7,5,9,0,3,1,6,2,4,8};
        quickSort(arr, 0 , arr.length-1);
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void quickSort(int[] arr , int start, int end) {
        if (start >= end) return; // 원소가 1개인 경우
        int pivot = start;
        int left = start+1;
        int right = end;
        while (left<=right) {
            // 피벗보다 큰 데이터를 찾을 때까지 반복
            while (left <= end && arr[left] <= arr[pivot]) {
                left++;
            }

            // 피벗보다 작은 데이털르 찾을 때 까지 반복
            while (right > start && arr[right] >= arr[pivot]) {
                right--;
            }

            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }else { // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교채
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
        quickSort(arr,start,right-1);
        quickSort(arr,right+1,end);
    }
}
