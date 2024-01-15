package org.ares.tennisgame;

public class InProgressResult extends Result {

    public static final String FIFTEEN_SCORE = "Fifteen";
    public static final String THIRTY_SCORE = "Thirty";
    public static final String FORTY_SCORE = "Forty";
    public static final String LOVE_SCORE = "Love";

    public InProgressResult(int player1Score, int player2Score) {
        super(player1Score, player2Score);
    }

    @Override
    String printScoreAsText() {
        return printScoreAsString(player1score) + "/" + printScoreAsString(player2Score);
    }

    private String printScoreAsString(int score) {
        switch (score) {
            case 1:
                return FIFTEEN_SCORE;
            case 2:
                return THIRTY_SCORE;
            case 3:
                return FORTY_SCORE;
            default:
                return LOVE_SCORE;
        }
    }
}
