package org.ares.tennisgame;

public class Player {

    private String nom;
    private int score;

    public void addPoint() {
        this.score += 1;
    }

    public Player(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public boolean eitherPlayerIsAheadByOne(Player player2) {
        return Math.abs(score - player2.getScore()) == 1;
    }

    public boolean eitherPlayerHasAdvantage(Player player2) {
        return score >= 4 || player2.getScore() >= 4;
    }

     public boolean isEqualScore(Player player2) {
        return this.score == player2.getScore();
    }

}
