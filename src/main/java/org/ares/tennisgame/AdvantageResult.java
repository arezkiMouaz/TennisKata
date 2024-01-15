package org.ares.tennisgame;

public class AdvantageResult extends Result {


    public static final String ADVANTAGE_PLAYER_A_RESULT = "Advantage Player A";
    public static final String ADVANTAGE_PLAYER_B_RESULT = "Advantage Player B";

    public AdvantageResult(int player1Score, int player2Score) {
        super(player1Score, player2Score);
    }

    @Override
    String printScoreAsText() {
        return (player1score - player2Score == 1) ? ADVANTAGE_PLAYER_A_RESULT : ADVANTAGE_PLAYER_B_RESULT;
    }
}
