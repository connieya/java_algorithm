package com.company.programmers.level1;

public class 옹알이 {
    public static void main(String[] args) {
        String babble = "yayae";
        babble = babble.replace("aya"," ");
        babble = babble.replace("ye"," ");
        babble = babble.replace("woo"," ");
        babble = babble.replace("ma"," ");
        System.out.println("babble = " + babble);
        System.out.println("babble.equals(\"\") = " + babble.equals(""));
    }
}
