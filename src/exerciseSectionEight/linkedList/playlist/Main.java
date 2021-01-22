package exerciseSectionEight.linkedList.playlist;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


        Album albumOne = new Album("A rush of blood to the head","Coldplay");
        albumOne.addSong("The Scientist",3.08);
        albumOne.addSong("Clocks", 2.55);
        albumOne.addSong("Amsterdam", 4.08);
        albumOne.addSong("Politik", 3.05);
        albumOne.addSong("In My Place", 3.14);
        albumOne.addSong("Green Light", 3.53);
        albumOne.addSong("A Whisper", 2.44);
        albums.add(albumOne);

        Album albumTwo = new Album("Amnesiac","Radiohead");
        albumTwo.addSong("Pyramid song", 4.04);
        albumTwo.addSong("I Might Be Wrong", 3.44);
        albumTwo.addSong("Knives Out", 3.20);
        albumTwo.addSong("Morning Bell/Amnesiac", 4.21);
        albumTwo.addSong("Like Spinning Plates", 3.50);
        albumTwo.addSong("Pulk", 4.33);
        albums.add(albumTwo);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("The Scientist", playlist);
        albums.get(0).addToPlaylist(3, playlist);
        albums.get(0).addToPlaylist("The Lady", playlist); // doesn't exist

        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(10, playlist); // no track 10

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator listIterator = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We've reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We're at the top of the play list");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                         if (listIterator.hasNext()) {
                             System.out.println("Now replaying " + listIterator.next().toString());
                             forward = true;
                         } else {
                             System.out.println("We have reached the end of the list");
                         }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        listIterator.remove();
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    }
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions: \npress " +
                "0 - to exit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - to remove song from playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty");
            return;
        }
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=======================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======================");

    }


}
