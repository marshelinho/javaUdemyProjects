package com.marsh.section8.PlaylistChallenge1;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Playlist theWall = new Playlist("The Wall", "Pink Floyd");

        theWall.addSong("In The Flesh?", 3.19);
        theWall.addSong("The Thin ice", 2.20);
        theWall.addSong("Another Brick in the Wall, Part 1", 3.21);
        theWall.addSong("The Happiest Days of Our Lives", 1.45);
        theWall.addSong("Another Brick in the Wall, Part 2", 4.00);
        theWall.addSong("Mother", 5.36);
        theWall.addSong("Goodbye Blue Sky", 2.45);
        theWall.addSong("Empty Spaces", 2.10);
        theWall.addSong("Young Lust", 3.25);
        theWall.addSong("One of My Turns", 3.35);
        theWall.addSong("Don't Leave Me Now", 4.16);
        theWall.addSong("Another Brick in the Wall, Part 3", 1.14);
        theWall.addSong("Goodbye Cruel World", 1.13);


        ArrayList<Playlist> albums = new ArrayList<Playlist>();

        albums.add(theWall);

        LinkedList<Song> gemutlich = new LinkedList<Song>();



        printPlaylist(gemutlich);


    }


    public static void printPlaylist(LinkedList<Song> playlist) {
        Iterator<Song> i = playlist.iterator();
        while (i.hasNext()) {
            System.out.println(i + " " + i.next());
        }
    }

    public static boolean addToPlaylist(LinkedList<Song> playlist, String title, double duration){
        playlist.add(new Song(title, duration));
        return true;
    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if(playlist.isEmpty()){
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next());
            System.out.println("---------");
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Quitting application");
                    break;

                case 1:

                    goingForward = playNext(goingForward, listIterator);
                    break;

                case 2:

                    goingForward = playPrevious(goingForward, listIterator);
                    break;

                case 3:
                    break;

                case 4:
                    break;

            }

        }


    }

    private static boolean playPrevious(boolean goingForward, ListIterator<Song> listIterator) {
        if (listIterator.hasPrevious()) {
            System.out.println("Now playing " + listIterator.previous());
        } else {
            System.out.println("We are at the start of the playlist");
            goingForward = true;
        }
        return goingForward;
    }

    private static boolean playNext(boolean goingForward, ListIterator<Song> listIterator) {
        if (!goingForward) {
            if (listIterator.hasNext()) {
                listIterator.next();
            }
            goingForward = true;
        }
        if (listIterator.hasNext()) {
            System.out.println("Now playing " + listIterator.next());
        } else {
            System.out.println("Reached the end of the list");
            goingForward = false;
        }
        return goingForward;
    }

    public static void printMenu(){
        System.out.println("0 - press to quit application");
        System.out.println("1 - press to skip to next song");
        System.out.println("2 - press to go back to previous song");
        System.out.println("3 - press to replay the current song");
        System.out.println("4 - press to display menu");
    }
}
