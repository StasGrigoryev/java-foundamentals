package exerciseSectionEight.linkedList.playlist;

import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.name = albumName;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index < this.songs.size()) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("No songs with this track number ");
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("No songs with this title");
        return false;
    }

    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

}
