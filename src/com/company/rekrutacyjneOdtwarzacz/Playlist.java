package com.company.rekrutacyjneOdtwarzacz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Playlist {
    private List<Track> tracks = new ArrayList<>();
    private Sequence sequence;

    public void addToPlaylist(Track track, Sequence sequence){
        this.sequence = sequence;
        tracks.add(track);
    }
    public void addToPlaylist(Track track){
        this.sequence = Sequence.RANDOM;
        tracks.add(track);
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }
}
