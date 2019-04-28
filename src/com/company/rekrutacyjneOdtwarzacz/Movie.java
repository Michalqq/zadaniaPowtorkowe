package com.company.rekrutacyjneOdtwarzacz;

public class Movie extends Music implements Track{
    private int videoQuality;

    public Movie(String name, String author, int videoQuality) {
        super(name, author);
        super.setTyp("film");
        this.videoQuality = videoQuality;
    }

    public int getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(int videoQuality) {
        this.videoQuality = videoQuality;
    }
}
