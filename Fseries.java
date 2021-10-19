package com.company;

import java.util.Scanner;

public class Fseries {
    public static void main(String[] args) {
        System.out.println("enter the limit for the series");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = 0;
        int y = 1;
        System.out.print(x);
        System.out.print(" " + y);
        for (int i = 0; i < n; ) {

            i = x + y;
            x = y;
            y = i;
            if (i > n) {
            break;
//                System.out.print(" " + i);
            }
            System.out.print(" " + i);
        }
    }
}
