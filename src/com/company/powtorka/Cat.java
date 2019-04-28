package com.company.powtorka;

public class Cat implements Animal {
    private String name;

    @Override
    public void run() {
        System.out.println("kot biega");
    }
}
