package com.tiven.questy.InnerClasses;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();

    }

    public SongList getSongList() {
        return songList;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public boolean addSong(Song song) {
            if (this.songs.contains(song)) return false;
            this.songs.add(song);
            return true;

        }

        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) return song;
            }
            return null;

        }

    }


    public boolean addSong(String title, double duration) {
        return this.songList.addSong(new Song(title, duration));
    }

//    private Song findSong(String title) {
//        for (Song song : this.songs) {
//            if (song.getTitle().equals(title)) return song;
//        }
//        return null;
//
//    }

    //    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
//        int index = trackNumber - 1;
//        if (index >= 0 && index <= this.songs.size()) {
//            playList.add(this.songs.get(index));
//            return true;
//        }
//        System.out.println("This album does not have a track " + trackNumber);
//        return false;
//    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songList.songs.size()) {
            playList.add(this.songList.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //    public boolean addToPlayList(String title, LinkedList<Song> playList) {
//        Song checkedSong = findSong(title);
//        if (checkedSong != null) {
//            playList.add(checkedSong);
//            return true;
//        }
//        System.out.println("This album does not have a track " + title);
//        return false;
//    }
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songList.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + title);
        return false;
    }

    public boolean addToPlayList(Song song, LinkedList<Song> playList) {
        if (song != null) {
            playList.add(song);
            return true;
        }

        System.out.println("This album does not have this song ");
        return false;
    }


}
