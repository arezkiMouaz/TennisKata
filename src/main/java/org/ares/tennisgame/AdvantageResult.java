package org.ares.tennisgame;

public class AdvantageResult extends Result {

    public static final String ADVANTAGE_PLAYER = "Advantage Player : %s";

    public AdvantageResult(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public String printScoreAsText() {
        return (player1.getScore() - player2.getScore() == 1) ? String.format(ADVANTAGE_PLAYER, player1.getNom()) : String.format(ADVANTAGE_PLAYER, player2.getNom());
    }
}
