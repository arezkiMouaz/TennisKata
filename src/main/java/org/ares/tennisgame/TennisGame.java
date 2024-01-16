package org.ares.tennisgame;

public class TennisGame {

    private Player player1;
    private Player player2;


    public TennisGame(String playerOneName, String playerTwoName) {
        this.player1 = new Player(playerOneName);
        this.player2 = new Player(playerTwoName);
    }

    public void winPoint(String playeName) {
        if (playeName.equals(player1.getNom())) {
            player1.addPoint();
        } else {
            player2.addPoint();
        }
    }

    public String getScore() {
        return Arbitre.determinerResultat(player1, player2).get();
    }
}
