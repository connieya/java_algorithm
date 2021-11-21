package com.company.study;


import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    String names;
    double direction;
    int grade;
    int index;

    public Student(String names, double direction, int grade, int index) {
        this.names = names;
        this.direction = direction;
        this.grade = grade;
        this.index = index;
    }


    @Override
    public int compareTo(Student o) {

        if (o.grade == this.grade) {
            if (o.direction == this.direction){
                return this.names.compareTo(o.names);
            }
            return (int) (o.direction - this.direction);
        }
        return o.grade - this.grade;
    }
}

public class Main {
    public static void main(String[] args) {
        String names[] = {"azad", "andy", "louis", "will", "edward"};
        int[][] homes = {{3, 4}, {-1, 5}, {-4, 4}, {3, 4}, {-5, 0}};
        double grades[] = {4.19, 3.77, 4.41, 3.65, 3.58};
        int answer[] = new int[names.length];

        Student students[] = new Student[names.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], Math.pow(homes[i][0], 2) + Math.pow(homes[i][1], 2), (int) grades[i], i);
        }
        Arrays.sort(students);
        int i = 1;
        for (Student student : students) {
            System.out.println(student.names + " " + student.index);
            answer[student.index] = i++;
        }
        for (int ii : answer){
            System.out.println(ii+" ");
        }
    }
}
