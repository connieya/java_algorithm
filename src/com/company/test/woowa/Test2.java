package com.company.test.woowa;

public class Test2 {
    public static void main(String[] args) {
        String[] log = {"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"};
        int len = log.length;
        int sum =0;
        String answer = "";
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                String start = log[i];
                String stop = log[i + 1];
                int hh_stop = Integer.parseInt(stop.substring(0, 2));
                int mm_stop = Integer.parseInt(stop.substring(3));
                int hh_start = Integer.parseInt(start.substring(0, 2));
                int mm_start = Integer.parseInt(start.substring(3));
                int mm = 0;
                int hh = 0;
                if (mm_stop >= mm_start) {
                    hh = hh_stop - hh_start;
                    mm = mm_stop - mm_start;
                } else {
                    hh = (hh_stop - 1) - hh_start;
                    mm = (mm_stop + 60) - mm_start;
                }
                int time = hh*60 + mm;
                if(time < 5){
                    continue;
                }
                if(time > 105) {
                    time = 105;
                }
                sum +=time;
            }
        }
        int hh = sum / 60;
        int mm = sum % 60;
        if (hh < 10) {
            answer += "0"+hh+":";
        }else {
            answer += hh+":";
        }
        if (mm < 10) {
            answer +="0"+mm;
        }else {
            answer += mm;
        }
        System.out.println(answer);

    }
}
