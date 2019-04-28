package com.company.powtorka;

public interface Animal {
    default void run(){
        System.out.println("Zwierze biega");
    }


}
