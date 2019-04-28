package com.company;

public class Tag {
    private String title;

    public Tag(String tag) {
        this.title = tag;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Tagg{" +
                "tagTitle='" + title + '\'' +
                '}';
    }
}
