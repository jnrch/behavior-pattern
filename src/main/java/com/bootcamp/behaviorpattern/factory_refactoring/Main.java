package com.bootcamp.behaviorpattern.factory_refactoring;

public class Main {
    public static void main(String[] args) {
        Price usdPrice = new American();
        Price euroPrice = new European();
        Price ukPrice = new Uk();

        System.out.println(usdPrice.getPrice());
        System.out.println(euroPrice.getPrice());
        System.out.println(ukPrice.getPrice());
    }
}
