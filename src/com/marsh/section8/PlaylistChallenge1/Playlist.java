package com.marsh.section8.PlaylistChallenge1;

import java.util.ArrayList;

public class Playlist {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Playlist(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        } else{
            System.out.println("Song already in album");
        }
        return false;
    }

    public Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
}