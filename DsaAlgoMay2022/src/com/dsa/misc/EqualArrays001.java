package com.dsa.misc;

public class EqualArrays001 {
    public static void main(String[] args) {

    }
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        int xorA = 0, xorB = 0;
        for(long l : A) {
            xorA ^= l;
        }
        for(long l : B) {
            xorB ^= l;
        }
        System.out.print(xorA);

        if( (xorA ^ xorB) == 0) {
            return true;
        } else {
            return false;
        }
        //boolean sum = (xorA^xorB == 0) ? true : false;


    }
}
