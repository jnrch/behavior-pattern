package com.bootcamp.behaviorpattern.factory_refactoring;

public class European extends Price {

    @Override
    double getPrice() {
        System.out.println("Spain, price in EUR");
        return 1.3;
    }
}
