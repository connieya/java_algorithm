package com.company.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 주차요금계산 {
    public static void main(String[] args) {
        int fees[] = {180, 5000, 10, 600}; // 기본 시간 , 기본 요금 , 단위 시간 , 단위 요금
        String records[] = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        // 차량 번호가 0~9999 까지니깐 배열 10000개를 선언해서 값을 정해주면 됨
        // 해당 차량이 총 주차한 시간 배열 1개 , 해당 차량이 입차했을 때 시간
        int total_time[] = new int[10000];
        int in_out[] = new int[10000];
        Arrays.fill(in_out, -1);
        for (String record : records) {
            StringTokenizer st = new StringTokenizer(record, " ");
            int time = toTime(st.nextToken());
            int car_num = Integer.parseInt(st.nextToken());
            String inOut = st.nextToken();
            if (inOut.equals("IN")) { // 입차
                in_out[car_num] = time;
            } else { // 출차
               total_time[car_num] += time - in_out[car_num];
               in_out[car_num] = -1;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<10000; i++){
            if (in_out[i] != -1) { // 입차하고 출차 안했을 때 23:59 시간 기준으로 주차요금 추가 계산
                total_time[i] += toTime("23:59")-in_out[i];
            }
            if (total_time[i] >0){
                ans.add(calcFees(fees,total_time[i]));
            }
        }
        int answer [] = new int[ans.size()];
        for (int i=0; i<answer.length; i++){
            answer[i] = ans.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
    public static int calcFees(int fees[] , int totalTime){
        if (totalTime <= fees[0]) return fees[1];
        int extra = totalTime-fees[0]; // 총 시간에서 기본시간 뺌
        return fees[1]+ ((extra+fees[2]-1)/fees[2]) * fees[3];
    }

    public static int toTime(String str) {
        return Integer.parseInt(str.substring(0, 2)) * 60 + Integer.parseInt(str.substring(3));
    }
}
