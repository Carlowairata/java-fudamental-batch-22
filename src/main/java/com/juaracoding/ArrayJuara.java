package com.juaracoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayJuara {
    public static void main(String[] args) {

        int[] angka = {1, 2, 3, 4, 5};
        System.out.println(angka[3]);

        Integer[] numbers = new Integer[5];
        numbers[0] = 80;
        numbers[1] = 70;
        numbers[2] = 90;
        numbers[3] = 99;
        numbers[4] = 95;
        System.out.println(numbers[3]);

        Arrays.sort(numbers, Collections.reverseOrder());

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);

        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan jumlah data");
        int jumlah = scanner.nextInt();
        int[] price = new int[jumlah];
        int totalPrice = 0;
        for (int i = 0; i < price.length; i++) {
            System.out.println("Masukan Harga");
            price[i] = scanner.nextInt();
            totalPrice += price[i];

        }

        System.out.println(totalPrice);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car.toUpperCase());
        }

        int[][] num = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(num[0][3]);
        System.out.println(num[1][1]);
        System.out.println(num.length);


        Arrays.binarySearch(numbers,99);


    }
}



