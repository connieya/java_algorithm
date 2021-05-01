package com.company.inflearn.sec02;

public class Array09 {
    public static void main(String[] args) {

        // primitive 타입이라서 값에 의한 호출
        // => 호출된 값이 변경되어도 호출한 값은 변경되지 않는다.
        int k = 100;

        example(k);

        System.out.println("k  = " + k);

// ------------------------------------------------------------

        // 배열은 primitive 타입이 아니다.
        // => 호출된 값이 변경되면 호출한 값도 변경된다.

        int data [] = {4,2,3};

        example1(data);

        for(int d : data)
            System.out.println("data : " + d);
    }



    private static int example(int b) {

        b =50;
        return  b;
    }

    // ---------------------------------------------------------
    private static void example1(int [] array) {

        array[0] = 3;
        array[1]= 2;
        array[2]=19;
    }
}
