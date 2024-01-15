package org.ares.tennisgame;

public class ExecoResult extends Result {

    public static final String LOVE_ALL_RESULT = "Love-All";
    public static final String FIFTEEN_ALL_RESULT = "Fifteen-All";
    public static final String THIRTY_ALL_RESULT = "Thirty-All";
    public static final String DEUCE_RESULT = "Deuce";

    public ExecoResult(int player1Score, int player2Score) {
        super(player1Score, player2Score);
    }

    @Override
    String printScoreAsText() {
        switch (player1score) {
            case 0:
                return LOVE_ALL_RESULT;
            case 1:
                return FIFTEEN_ALL_RESULT;
            case 2:
                return THIRTY_ALL_RESULT;
            default:
                return DEUCE_RESULT;
        }
    }
}
