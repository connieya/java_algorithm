package com.company.programmers.level1;

public class 키패드누르기 {
    static int numbers[] = {1,3,4,5,8,2,1,4,5,9,5};
    static String hand = "right";
    static int left[] = {3, 0};
    static int right[] = {3, 2};
    static int L_dis, R_dis;
    static int NumberPad[][] = {
            {3, 1}, //0
            {0, 0}, // 1
            {0, 1}, // 2
            {0, 2}, //3
            {1, 0}, //4
            {1, 1}, //5
            {1, 2}, //6
            {2, 0}, //7
            {2, 1}, //8
            {2, 2} //9
    };
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        for (int number : numbers) {
            String handPoint = clickKeyPad(number);
            sb.append(handPoint);
        }
        System.out.println(sb);
    }

    static String clickKeyPad(int number) {
        if (number == 1 || number == 4 || number == 7) {
            left = NumberPad[number];
            return "L";
        }
        if (number == 3 || number == 6 || number == 9) {
            right = NumberPad[number];
            return "R";
        }
        return clickMiddleOfKeyPad(number);

    }

    static String clickMiddleOfKeyPad(int number) {
        L_dis = Math.abs(left[0] - NumberPad[number][0]) + Math.abs(left[1] - NumberPad[number][1]);
        R_dis = Math.abs(right[0] - NumberPad[number][0]) + Math.abs(right[1] - NumberPad[number][1]);
        if (L_dis > R_dis) {
            right = NumberPad[number];
            return "R";
        }
        if (L_dis < R_dis) {
           left = NumberPad[number];
            return "L";
        }
        String hands = (hand.equals("right")) ? "R" :"L";
        return hands;
    }

}

