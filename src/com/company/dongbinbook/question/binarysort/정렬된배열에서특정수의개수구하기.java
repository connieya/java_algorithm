package com.company.dongbinbook.question.binarysort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정렬된배열에서특정수의개수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 데이터의 개수 n , 찾고자 하는 값 x
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        // 전체 데이터 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 값이 x ~ x 범위에 있는 데이터의 개수 계산
        int cnt = countByRange(arr,x,x);
        if (cnt == 0){
            System.out.println(-1);
        }else {
            System.out.println(cnt);
        }
    }
    // 값이 leftValue 인 위치 구하기
    public static int lowerBound(int[]arr, int target , int start , int end) {
        while (start <end) {
            int mid = (start+end) /2;
            if (arr[mid] >= target) {
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return end;
    }
    // 값이 rightValue 인 위치 구하기
    public static int upperBound(int []arr , int tartget , int start, int end) {
        while (start < end){
            int mid =(start + end) / 2;
            if (arr[mid] > tartget){
                end = mid;
            }
            else {
                start = mid +1;
            }
        }
        return end;
    }

    //값이 left_value ~ right_value 인 데이터의 개수를 반환하는 함수
    public static int countByRange(int[]arr , int leftValue , int rightValue) {
        int rightIndex = upperBound(arr,rightValue ,0, arr.length);
        int leftIndex = lowerBound(arr,leftValue,0,arr.length);
        return rightIndex -leftIndex;
    }
}
