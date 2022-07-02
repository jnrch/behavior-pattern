package com.bootcamp.behaviorpattern.factory_refactoring;

public class American extends Price {

    @Override
    double getPrice() {
        System.out.println("US, price in USD");
        return 0.94;
    }
}
