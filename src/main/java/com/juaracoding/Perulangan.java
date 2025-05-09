package com.juaracoding;


import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {


        int tinggi = 10;

        for (int i = 1; i <= tinggi; i++) {// i=10 < 10
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            int sum = 0;
            int item = 0;
            while (item < 5) {
                item++;
                if (item == 2) continue;
                sum += item;
            }
            System.out.println(sum);



        }
        Scanner scanner = new Scanner(System.in);
        int pin = 112233;
        boolean isBlocked = false;
        int count = 0;
        int maxLooping = 3;

        do {

            System.out.println("Input Pin :");
            int inPin = scanner.nextInt();
            if (inPin == pin) break;
            count++;
            if (count == maxLooping) isBlocked = true;
        } while (count < maxLooping);

        if (!isBlocked) {
            System.out.println("Lanjutkan Transaksi");
        } else {
            System.out.println("Pin diblokir sementara");
        }
    }

}






