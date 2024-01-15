package org.ares.tennisgame;

public class WinResult extends Result {

    public static final String WIN_FOR_PLAYER_A = "Win for Player A";
    public static final String WIN_FOR_PLAYER_B = "Win for Player B";

    public WinResult(int player1Score, int player2Score) {
        super(player1Score, player2Score);
    }

    @Override
    String printScoreAsText() {
        return (player1score - player2Score >= 2) ? WIN_FOR_PLAYER_A : WIN_FOR_PLAYER_B;
    }
}
