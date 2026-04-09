package br.com.minhasmusicas.models;

public class MyFavorites {

    public void include(Audio audio) {
        if (audio.getClassification() >= 8){
            System.out.println(audio.getTitle() + " is one of the bests!");
        } else {
            System.out.println(audio.getTitle() + " everybody likes it!");
        }
    }
}
