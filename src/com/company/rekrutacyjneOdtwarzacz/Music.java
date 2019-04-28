package com.company.rekrutacyjneOdtwarzacz;

public class Music implements Track {
    private String name;
    private String author;
    private String typ = "piosenka";

    public Music(String name, String author) {
        this.name = name;
        this.author = author;

    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTyp() {
        return typ;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
