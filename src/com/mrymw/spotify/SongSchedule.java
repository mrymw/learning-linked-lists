package com.mrymw.spotify;
import com.mrymw.linkedLists.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SongSchedule {
    Queue<Song> songQueue;
    public SongSchedule() {this.songQueue = new LinkedList<>();}
    public void addSong(String name, String artist, double duration) {
        Song song = new Song(name, artist, duration);
        songQueue.add(song);
    }
    public void processSongs() {
        if(songQueue.isEmpty()) {
            System.out.println("nothing to process, song queue is empty!");
        } else {
            Song song = songQueue.poll();
            System.out.println("processed song: " + song);
        }
    }
    public void moveToDifferentPosition(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= songQueue.size() || toIndex < 0 || toIndex >= songQueue.size()) {
            System.out.println("Invalid Position");
            return;
        }
        LinkedList<Song> list = new LinkedList<>(songQueue);
        Song song = list.remove(fromIndex);
        list.add(toIndex, song);
        songQueue.clear();
        songQueue.addAll(list);
        System.out.println(songQueue);
    }
    public void addToASpecificIndex(int index, Song song) {
        if (index < 0 || index > songQueue.size()) {
            System.out.println("Invalid position");
            return;
        }

        LinkedList<Song> list = new LinkedList<>(songQueue);
        list.add(index, song);

        songQueue.clear();
        songQueue.addAll(list);
    }

}
