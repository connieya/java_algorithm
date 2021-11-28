package com.company.dongbinbook.question.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student o) {
        if (o.korean == this.korean && o.english  == this.english && o.math == this.math){
            return this.name.compareTo(o.name);// 모든 점수가 같으면 사전 순으로 오름차순
        }

        if (o.korean == this.korean && o.english == this.english){
            return o.math - this.math; // 국어 점수와 영어 점수가 같으면 수학 점수 내림차순
        }
        if (o.korean== this.korean){
            return this.english - o.english; // 국어 점수가 같으면 영어 점수 오름차순
        }
        return o.korean - this.korean; // 국어 점수 내림 차순
    }
}

public class 국영수_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Student students[] = new Student[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.name);
        }
        br.close();

    }
}
