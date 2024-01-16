package org.ares.tennisgame;

import java.util.HashMap;
import java.util.Map;

abstract class Result{

    Player player1;
    Player player2;

    Map<Integer, Integer> scores = new HashMap<>();

    protected Result(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        scores.put(0, 0);
        scores.put(1, 15);
        scores.put(2, 30);
        scores.put(3, 40);
    }

    public String printScoreAsText(){
        return String.format("Player %s : %d / Player %s : %d", this.player1.getNom(), scores.get(this.player1.getScore()), this.player2.getNom(), scores.get(this.player2.getScore()));
    }
}
