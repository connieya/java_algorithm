package com.company.study.bit;

public class Test {
    public static void main(String[] args) {
        // 해당 자리 수를 1로 세팅 , 3번 인덱스를 1로 세팅
        //  0101 |  1000 ( 1 << 3) => 1101
        System.out.println(setBit(5, 3));


        // 해당 자리 수를 0으로 세팅 , / 3번 인덱스를 0으로 세팅
        // 1001  & 0111 (~1 << 3)  =>  0
        System.out.println(clearBit(9,3));


        // 1001 & 1000( 1<< 3) => 1000
        // 해당 자리 수가 1인지 0인지 확인
        // 0이면 그 값은 0이고 1이면 해당 자리수에 맞는 십진수 값이다.
        System.out.println(getBit(9,3));

   }

    static int setBit(int num, int i) {
        return num | (1 << i);
    }

    static int clearBit(int num, int i) {
        return num & ~(1 << i);
    }

     static boolean getBit(int num , int i) {
        return (num & 1 << i) != 0;
    }
}
