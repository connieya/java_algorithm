package com.company.study2021.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Result {
    int country_num; // 참가국 번호
    int student_num; // 학생 번호
    int score; // 점수

    public Result(int country_num, int student_num, int score) { // 입력 값 생성자로 받음
        this.country_num = country_num;
        this.student_num = student_num;
        this.score = score;
    }
}

public class 아시아정올_2535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // scanner  대신 사용
        int n = Integer.parseInt(br.readLine()); // 대회 참가 학생 수
        Result[] results = new Result[n]; // 참가 학생의 참가국 번호, 학생번호, 점수가 담긴 Result 객체 배열
        int[] countryNumArray = new int[101]; // 참가 학생 수는 최대 100명이고 모두 다른 나라일 경우
        // 최대 국가도 100개
        for (int i = 0; i < n; i++) { // 참가 학생 수
            StringTokenizer st = new StringTokenizer(br.readLine()); // 입력 값 공백을 기준으로 나누기 ex) 1 1 230
            int country_num = Integer.parseInt(st.nextToken()); // 공백 기준으로 첫번째 입력값 1
            int student_num = Integer.parseInt(st.nextToken()); // 그 다음 1
            int score = Integer.parseInt(st.nextToken()); // 그  다음 230
            results[i] = new Result(country_num, student_num, score); // 각각 객체 배열 인덱스 값으로 초기화
        }

        Arrays.sort(results, new Comparator<Result>() { // 점수 높은 순서대로 정렬
            @Override
            public int compare(Result o1, Result o2) {
                return o2.score - o1.score;
            }
        });
        int count = 0; // 배열 인덱스 역할
        int print = 0; // 동메달까지 출력하기 위한 초기화 숫자
        while (print <3) { // 점수 높은 순서대로 정렬 후 동메달 까지만 출력한다.
            int country_num = results[count].country_num; //정렬 후 배열 0번째 인덱스 부터 참가국 번호 추출
            countryNumArray[country_num]++; // 참가국 번호를 인덱스로 갖는 배열
            //해당 참가국 인덱스 값이 증가하는데 나라 별 메달 수는 최대 2개
            if (countryNumArray[country_num] <3) { // 참가국 번호, 학생 번호 출력
                System.out.println(results[count].country_num+" "+results[count].student_num);
                print++; // 동메달 까지 출력하기 위한 기준
            }
            count++; // 동메달 까지 뽑기 위해 Result 객체 인데스 번호 증가
        }
    }
}
