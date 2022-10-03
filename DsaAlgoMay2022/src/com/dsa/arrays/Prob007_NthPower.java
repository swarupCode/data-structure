package com.dsa.arrays;

public class Prob007_NthPower {
    public static void main(String[] args) {
        int num = 9;
        int power = 3;

        int p = power(9, 3);
        System.out.println("Power of "+num+" is: "+p);
    }

    private static int power(int num, int pow) {
        if(pow == 0) {
            return 1;
        }
        return num * power(num, pow-1);
    }
}
