package com.company.powtorka;

public class Microsoft implements Database {

    @Override
    public void save() {
        System.out.println("Używam bazy Microsoft");
    }
}
