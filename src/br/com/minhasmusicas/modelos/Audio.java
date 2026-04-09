package br.com.minhasmusicas.modelos;

public class Audio {
    private String name;
    private int totalOfReproductions;
    private int totalOfLikes;
    private int classification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        totalOfLikes ++;
    }

    public void reproduce(){
        totalOfReproductions++;
    }
}
