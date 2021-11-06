package com.company.test.woowa;

public class Test5 {
    public static void main(String[] args) {
        // 월요일 출근 = 13;
        // 금요일 퇴근 = 18;
        double time = 3.5;
        String[][] plans = {{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"}};
        int len = plans.length;
        for (int i = 0; i < len; i++) {
            String country = plans[i][0];
            String departure = plans[i][1];
            String arrival = plans[i][2];
            int departure_clock = 0;
            int arrival_clock = 0;
            if (departure.length() == 3) {
                int clock = Integer.parseInt(departure.substring(0, 1));
                if (departure.substring(1).equals("AM")) {
                    if (clock == 12) {
                        time-= 8.5;
                    }else {
                        if (clock <=9) {
                            time -= 8.5;
                        }else {
                            time -= (18-clock);
                        }
                    }
                }else {
                    if (clock == 12) {
                       time -= 8;
                    }
                }
            }else {
                int clock = Integer.parseInt(departure.substring(0, 2));
                if (departure.substring(2).equals("AM")) {
                    if (clock == 12) {
                        time-= 8.5;
                    }else {
                        if (clock <=9) {
                            time -= 8.5;
                        }else {
                            time -= (18-clock);
                        }
                    }
                }else {
                    if (clock == 12) {
                        time -= 8;
                    }
                }
            }

            if (arrival.length() == 3) {
                int clock = Integer.parseInt(arrival.substring(0, 1));
                if (arrival.substring(1).equals("AM")) {
                    
                }else {

                }
            }else {
                int clock = Integer.parseInt(arrival.substring(0, 2));
                if (arrival.substring(2).equals("AM")) {

                }else {

                }

            }


        }
    }
}
