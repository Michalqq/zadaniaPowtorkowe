package com.company.powtorka;

public class Oracle implements Database {

    @Override
    public void save() {
        System.out.println("Używam bazy Oracle");
    }
}
