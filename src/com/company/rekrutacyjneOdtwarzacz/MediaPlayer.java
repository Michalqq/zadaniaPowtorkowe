package com.company.rekrutacyjneOdtwarzacz;

import com.company.powtorka.Database;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    private List<Playlist> playlists = new ArrayList<>();


    public void addToMediaPlayer(Playlist playlist) {
        playlists.add(playlist);
    }
    public void addToMediaPlayer(Track track) {
        Playlist playlist = new Playlist();
       // playlists.add(playlist.addToPlaylist(track));
    }

    public static void main(String[] args) {
        Track music = new Music("Czarne oczy", "Jason Derulo");
        Track music2 = new Music("Czerwone i bure", "Rihanna");
        Track movie = new Movie("Casablanca", "Polanski",  1080);

        Playlist playlist = new Playlist();
        playlist.addToPlaylist(music);
        playlist.addToPlaylist(music2);
        playlist.addToPlaylist(movie);
        Playlist playlist2 = new Playlist();
        playlist2.addToPlaylist(new Music("Rolling Stones", "Rolling Stones"));
        playlist2.addToPlaylist(new Music("Michael Jackson", "Michael Jackson"));
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.addToMediaPlayer(playlist);
        mediaPlayer.addToMediaPlayer(playlist2);
        Play(mediaPlayer);
        //playlist.addToPlaylist(playlist2);
        //Play(playlist);

    }
    public static void Play(MediaPlayer playlist) {
        for (Playlist playlists:playlist.getPlaylists()){
            for (Track tracks : playlists.getTracks()){
                System.out.println(tracks.getTyp() + " : " + tracks.getName());
            }
        }
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }
}
