package com.viraj2.test;

/**
 * Created by vkulkarni3 on 2/13/17.
 */
public class Fuzz {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i < n; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("StringBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(Integer.toString(i) + " ");
            }
        }
    }
}
