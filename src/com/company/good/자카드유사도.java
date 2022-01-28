package com.company.good;

public class 자카드유사도 {

    public static int lower_bound(int arr[] , int start ,int end ,int target) {
        while (start < end) {
            int mid = (start+end) /2;
            if(arr[mid] >= target) {
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return end;
    }

    public static int upper_bound(int arr[] , int start ,int end ,int target) {
        while (start < end) {
            int mid = (start+end) /2;
            if(arr[mid] > target) {
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int a_arr[] = {1,1,2,2,3,4,5,6,7,8}; // 정렬되어 있다고 가정
        int b_arr[] = {1,2,2,4,4,4,5}; // 정렬되어 있다고 가정
        int intersection = 0; // 교집합
        int union = 0; // 합집합
        // 교집합 과 합집합을 구할 거임
        int prev = -1;
        for (int i=0; i<a_arr.length; i++){
            int num = a_arr[i]; // 숫자 1~ 8 까지
            if(prev == num){
                continue;
            }
            // 먼저 교집합의 개수 => (중복을 허용함)  {1,2,2,3,4,5,6,7,8} => 중복 원소의 min(i1,i2) 개수
            // lower_bound 와 upper_bound 의 차이가 0이면 => 이 원소는 교집합이 아님 => a_arr 꺼 탐색할 필요가 없음
            int b_cnt = upper_bound(b_arr,0,b_arr.length,num ) -lower_bound(b_arr,0,b_arr.length,num);
            int a_cnt = upper_bound(a_arr,0,a_arr.length,num) - lower_bound(a_arr,0,a_arr.length,num);
            System.out.println(a_cnt+" "+b_cnt);
            int tmp = a_cnt;
            a_cnt = Math.min(a_cnt,b_cnt); // 교집합의 개수
            b_cnt = Math.max(tmp,b_cnt); // 합집합의 개수
            intersection+=a_cnt;
            union += b_cnt;
            prev = num;
        }
        // 교집합 = {1,2,2,4,5};
        // 합집합 = {1,1,2,2,3,4,4,4,5,6,7,8}
        System.out.println(intersection +" " + union);
    }
}
