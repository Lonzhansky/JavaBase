package com.hillel.lonzhansky.lessons.lesson15.task2;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] arrayMusic = new MusicStyles[] {
                new PopMusic(),
                new ClassicMusic(),
                new RockMusic()
        };


        for (MusicStyles musicStyles : arrayMusic) {
            musicStyles.playMusic();
        }
    }
}
