package com.juaracoding.oop;

public class Kotak {

    int sisi;

    protected Kotak() {
        ;
        sisi = 5;
    }

    protected Kotak(int s) {
        this.sisi = s;
    }


    protected void draw() {
        for (int i = 0; i <= sisi; i++) {// i=10 < 10
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

