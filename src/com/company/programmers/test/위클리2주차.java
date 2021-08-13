package com.company.programmers.test;


public class 위클리2주차 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[][] scores = {
                {100, 90, 98, 88, 65},
                {50, 45, 99, 85, 77},
                {47, 88, 95, 80, 67},
                {61, 57, 100, 80, 65},
                {24, 90, 94, 75, 65}
        };
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            boolean check = false;
            double result = 0;
            for (int j = 0; j < scores[i].length; j++) {
                int self = scores[i][i];
                sum += scores[j][i];
                if (i != j && self == scores[j][i]) {
                    check = true;
                }
                max = Math.max(max, scores[j][i]);
                min = Math.min(min, scores[j][i]);
            }
            System.out.println("sum =" +sum);
            if (check){
                 result = sum / (double) scores.length;
            }else{
                if (scores[i][i] == max || scores[i][i] ==min) {
                     result = (sum-scores[i][i]) / (double)(scores.length-1) ;
                }else{

                    result = sum / (double) scores.length;
                }
            }
            System.out.println(result);
            sb.append(getGrade(result));
        }
        System.out.println(sb);
    }
    public static String getGrade(double result){
        if (result >= 90) return  "A";
        if (result>=80) return "B";
        if (result>=70) return "C";
        if (result>=50) return "D";
        return "F";
    }
}
