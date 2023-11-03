package com.gradeproject.q2;

import java.util.*;

public class powerfactor {
    public static int calPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int pow_nm1 = calPow(x, n - 1);
        int pow_x = x * pow_nm1;
        return pow_x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x = sc.nextInt();
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("value of x power n is:" + " " + calPow(x, n));

    }
}
