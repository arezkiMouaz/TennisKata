package org.ares.tennisgame;

abstract class Result {

    int player1score;
    int player2Score;

    public Result(int player1Score, int player2Score) {
        this.player1score = player1Score;
        this.player2Score = player2Score;
    }

    abstract String printScoreAsText();
}
