package com.tiven.questy.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ChallangeMain {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Faceless", "Godsmack");

        album.addSong("Faceless", 2.33);
        album.addSong("Changes", 3.21);
        album.addSong("Serenity", 2.35);
        album.addSong("I Stand Alone", 4.53);
        album.addSong("Make Me Believe", 2.44);
        album.addSong("Dead and Broken", 3.22);
        album.addSong("I Fucking Hate You", 2.11);
        album.addSong("Realign", 3.53);
        album.addSong("I Am", 2.12);
        album.addSong("Releasing Demons", 3.09);

        albums.add(album);

        album = new Album("For Those About To Rock", "AC/DC");

        album.addSong("For Those About To Rock", 5.33);
        album.addSong("I put a finger in you", 2.23);
        album.addSong("Lets go", 3.55);
        album.addSong("Inject the venom", 1.53);
        album.addSong("Snowballed", 2.14);
        album.addSong("Evil walks", 3.25);
        album.addSong("C.O.D", 4.11);
        album.addSong("Breaking the rules", 7.53);
        album.addSong("Night of the ling knives", 6.12);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();

        albums.get(0).addToPlayList("Faceless", playList);
        albums.get(0).addToPlayList("I Stand Alone", playList);
        albums.get(0).addToPlayList("I Am here", playList); // does not exist
        albums.get(0).addToPlayList(9, playList);

        albums.get(1).addToPlayList("Lets go", playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(24, playList); // does not exist

        play(playList);

    }

    public static void showOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To quit");
        System.out.println("\t 1 - Go to next song");
        System.out.println("\t 2 - Go to previous song");
        System.out.println("\t 3 - Replay song");
    }

    public static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No song in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
        showOptions();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            showOptions();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of playlist");
                        //System.out.println("Now replaying " + listIterator.previous());
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) listIterator.previous();
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("You're at the start of playlist");
                        // System.out.println("Now replaying " + listIterator.next());
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("You're at the start of playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next());
                            forward = true;

                        }
                        break;

                    }
            }


        }
    }
}
