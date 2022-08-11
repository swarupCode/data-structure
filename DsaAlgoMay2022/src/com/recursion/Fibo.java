package com.recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    public static int fib(int num) {
        if(num < 2) {
            return num;
        }
        return fib(num-1) + fib(num - 2);
    }
}
