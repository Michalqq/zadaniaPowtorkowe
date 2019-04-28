package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Post post = new Post("Programowanie jest super", "michalos");
        post.addTag("programowanie");
        post.addTag("java");
        post.addTag("programowanie");
        System.out.println(post);

        Post post2 = new Post("Programowanie jest super", "michalos");
        post2.addTag(new Tag("programowanie"));
        post2.addTag(new Tag("java"));
        post2.addTag(new Tag("programowanie"));
        System.out.println(post2);
    }
}
