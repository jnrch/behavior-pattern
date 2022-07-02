package com.bootcamp.behaviorpattern.factory_refactoring;

public class Uk extends Price {

    @Override
    double getPrice() {
        System.out.println("Uk, price in GBP");
        return 2.1;
    }
}
