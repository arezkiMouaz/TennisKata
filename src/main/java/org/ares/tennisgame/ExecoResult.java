package org.ares.tennisgame;

public class ExecoResult extends Result {
    public static final String DEUCE_RESULT = "Deuce";

    public ExecoResult(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public String printScoreAsText() {
        return (player1.getScore() <= 2) ? super.printScoreAsText() : DEUCE_RESULT;
    }
}
