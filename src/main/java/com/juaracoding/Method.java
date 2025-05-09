package com.juaracoding;

public class Method {
    public static void main(String[] args) {

        detailProduct("Nvidia Rtx 570", 15000, 10, minBuy());
        detailProduct("AMD Radeon", 10000, 100,minBuy());

        drawKotak(10);
        drawKotak(5);

        double luas = luasKotak(10);
        System.out.println(luas);
        System.out.println(luasKotak(5));


    }

    public static void drawKotak(int sisi) {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static double luasKotak(int sisi) {
        return sisi * sisi;
    }


    public static void detailProduct(String productName, double price, int stock, int minBuy){
        System.out.println("Nama Product:" + productName);
        System.out.println("Harga:" + price);
        System.out.println("Jumlah Stok" + stock);
        System.out.println("Min Pembelian" + minBuy);

        if (stock > 100) {
            System.out.println("Stock tidak boleh lebih dari 100");
        }
    }

    public static double subTotal(int amount, double price) {
        return amount * price;
    }

    public static int minBuy() {
        return 1;
    }
}




