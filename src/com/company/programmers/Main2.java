package com.company.programmers;


public class Main2 {
    public static void main(String[] args) {
        int min,tmp;
        int []numArr = {7,2,5,1,3};
        System.exit(-1);
        for (int i=0; i<numArr.length-1; i++) {
            min = i;
            for (int j=i+1; j<numArr.length; j++){
                if (numArr[j] < numArr[min]){
                    min = j;
                }
            }
            tmp = numArr[i];
            numArr[i] = numArr[min];
            numArr[min] = tmp;
        }
        for (int x =0; x<numArr.length; x++){
            System.out.print( numArr[x]+" ");
        }

    }

}
