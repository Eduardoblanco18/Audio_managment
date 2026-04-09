package br.com.minhasmusicas.modelos;

public class Audio {
    private String title;
    private int totalOfReproductions;
    private int totalOfLikes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalOfReproductions() {
        return totalOfReproductions;
    }

    public int getTotalOfLikes() {
        return totalOfLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void like(){
        this.totalOfLikes ++;
    }

    public void reproduce(){
        this.totalOfReproductions++;
    }
}
