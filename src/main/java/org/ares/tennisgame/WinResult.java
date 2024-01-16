package org.ares.tennisgame;

public class WinResult extends Result {

    public static final String WIN_FOR_PLAYER = "Player %s wins the game";

    public WinResult(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public String printScoreAsText() {
        return (player1.getScore() - player2.getScore() >= 2) ? String.format(WIN_FOR_PLAYER, player1.getNom()) : String.format(WIN_FOR_PLAYER, player2.getNom());
    }
}
