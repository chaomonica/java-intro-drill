import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    public String name;
    public ArrayList<Song> songs;

    public Playlist(String name){
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public boolean isEmpty(){
        return this.songs.isEmpty();
    }

    public void addSong(Song song){
        this.songs.add(song);
    }

    public String[] songNames(){
        String[] songArray = new String[this.songs.size()];
        for (int i = 0; i < this.songs.size(); i++) {
            songArray[i] = this.songs.get(i).title;
        }
        return songArray;
    }
    public int totalDuration(){
        int totalDuration = 0;

        for (Song song : this.songs) {
            totalDuration+= song.durationInSeconds;
        }

        return totalDuration;
    }

    public void swap(Song songOne, Song songTwo){
        int songOneIndex = this.songs.indexOf(songOne);
        int songTwoIndex = this.songs.indexOf(songTwo);
        Collections.swap(this.songs, songOneIndex, songTwoIndex);
    }

    public void removeSong(Song song){
        int songIndex = this.songs.indexOf(song);
        this.songs.remove(songIndex);
    }
}
