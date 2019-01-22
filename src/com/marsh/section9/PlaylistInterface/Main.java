package com.marsh.section9.PlaylistInterface;

import com.marsh.section8.PlaylistChallenge.Album;
import com.marsh.section8.PlaylistChallenge.Song;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");


        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady Double Dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High Ball shooter", 4.27);
        album.addSong("The Gypsy", 4.2);
        album.addSong("Soldier of Fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil Walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("You can't do it right", playlist);
        albums.get(0).addToPlaylist("Holy Man", playlist);
        albums.get(0).addToPlaylist("Speed king", playlist);
        albums.get(0).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(8, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(24, playlist);

        play(playlist);

    }


    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("no songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    forward = playNext(forward, listIterator);
                    break;
                case 2:
                    forward = playPrevious(forward, listIterator);
                    break;
                case 3:
                    forward = replay(forward, listIterator);
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;

            }
        }
    }

    private static boolean replay(boolean forward, ListIterator<Song> listIterator) {
        if (forward){
            if(listIterator.hasPrevious()){
                System.out.println("Now replaying " + listIterator.previous().toString());
                forward = false;
            } else {
                System.out.println("We are not at the start of our list");
            }
        } else {
            if (listIterator.hasNext()){
                System.out.println("Now replaying " + listIterator.next().toString());
                forward = true;
            } else {
                System.out.println("We have reached the end of the list");
            }
        }
        return forward;
    }

    private static boolean playPrevious(boolean forward, ListIterator<Song> listIterator) {
        if(forward){
            if (listIterator.hasPrevious()){
                listIterator.previous();
            }
            forward = false;
        }
        if (listIterator.hasPrevious()){
            System.out.println("Now playing " + listIterator.previous().toString());
        } else {
            System.out.println("We are at the start of the playlist");
            forward = true;
        }
        return forward;
    }

    private static boolean playNext(boolean forward, ListIterator<Song> listIterator) {
        if(!forward){
            if(listIterator.hasNext()){
                listIterator.next();
            }
            forward = true;
        }

        if(listIterator.hasNext()){
            System.out.println("Now playing " + listIterator.next().toString());
        } else {
            System.out.println("We have reached the end of the playlist");
            forward = false;
        }
        return forward;
    }

    private static void printMenu(){
        System.out.println("Available actions: \n press");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - display Menu\n");
    }

    private static void printList(List<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("-----------");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------");

    }


}
