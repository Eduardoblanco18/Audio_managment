package br.com.minhasmusicas.main;

import br.com.minhasmusicas.models.Music;
import br.com.minhasmusicas.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Bring Me To Life");
        myMusic.setArtist("Evanescence");

        for (int i = 0; i < 1000; i++) {
            myMusic.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 10; i++) {
            myPodcast.like();
        }
    }
}
