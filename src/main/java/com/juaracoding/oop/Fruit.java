package com.juaracoding.oop;

public class Fruit {

    int grams;
    int calsPerGram;

    protected Fruit(int grams){
        this.grams = grams;
        this.calsPerGram = calsPerGram;
    }

    int totalCalories() {
        return grams * calsPerGram;
    }
}
