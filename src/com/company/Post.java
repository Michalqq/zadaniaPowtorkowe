package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Post implements Tagable {

    private String author;
    private String title;
    private Set<Tag> tags = new HashSet<>();

    public Post(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public void addTag(Tag tag) {
        boolean index = false;
        for (Tag tag1:tags){
            if (tag1.getTitle().equals(tag.getTitle())){
                index = true;
            }
        }

        if (!index) {
             tags.add(tag);
        }

    }

    @Override
    public void addTag(String tag) {
        tags.add(new Tag(tag));
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", tags=" + tags +
                '}';
    }
}
