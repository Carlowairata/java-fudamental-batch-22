package com.juaracoding;

public class operator {

    public static void main(String[] args) {

        int modulus = 11 % 3;
        System.out.println(modulus);

        int x = 2;
        int num1 = 10 * x++;
        System.out.println(num1);
        System.out.println(x);

        int y = 2;
        int num2 = 10 * ++y;
        System.out.println(num2);

        int num3 = (10 + 5) * 4;
        System.out.println(num3);

        int a = 10;
        a += 5;
        System.out.println(a);

        boolean relational = 5 <= 5;
        System.out.println(relational);

        //bitwise
        int num4 = 10 & 12;   //1010 & 1100 = 1000
        System.out.println(num4);

        int num5 = 181 >> 1;
        System.out.println(num5);

        int num6 = 108 << 1;
        System.out.println(num6);




    }
}


