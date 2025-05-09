package com.juaracoding.oop;

public class MainApp {

    public static void main(String[] args) {
        Fruit apple = new Fruit(100);
        apple.grams = 100;
        apple.calsPerGram = 52;
        System.out.println(apple.totalCalories());
        System.out.println(apple);

        Fruit mango = new Fruit(200);
        mango.grams = 200;
        mango.calsPerGram = 120;
        System.out.println(mango.totalCalories());
        System.out.println(mango);

        Kotak kotak1 = new Kotak(10);
        kotak1.draw();

        Kotak kotak2 = new Kotak(5);
        kotak2.draw();

        Kotak kotak = new Kotak();
        kotak.draw();

        Car byd = new Car("Listrik");
        byd.setTahunPembuatan(2025);
        byd.displaySpec();

        Car bmw = new Car("Pertamax");
        bmw.setTahunPembuatan(2024);
        bmw.displaySpec();


    }
}
