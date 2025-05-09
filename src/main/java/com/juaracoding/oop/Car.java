package com.juaracoding.oop;

public class Car {
    private String bahanBakar;
    private int tahunPembuatan;

    protected Car(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    protected void displaySpec(){
        System.out.println(bahanBakar);
        System.out.println(tahunPembuatan);
    }
}
