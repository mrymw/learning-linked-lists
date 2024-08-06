package com.mrymw.spotify;

public class Main {
    public static void main(String[] args) {
        SongSchedule songSchedule = new SongSchedule();
        songSchedule.addSong("apples", "happines", 2.45);
        songSchedule.addSong("bananas", "sadness", 3.45);
        songSchedule.addSong("grapes", "anger", 6.78);
        songSchedule.moveToDifferentPosition(2, 0);

    }
}
