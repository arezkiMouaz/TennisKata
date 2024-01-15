package org.ares.tennisgame;

public class Arbitre {

    public static Result determinerResultat(Player player1, Player player2) {
        if (player1.isEqualScore(player2)) {
            return new ExecoResult(player1.getScore(), player2.getScore());
        } else if (player1.eitherPlayerHasAdvantage(player2) && player1.eitherPlayerIsAheadByOne(player2)) {
            return new AdvantageResult(player1.getScore(), player2.getScore());
        } else if (player1.eitherPlayerHasAdvantage(player2)) {
            return new WinResult(player1.getScore(), player2.getScore());
        } else {
            return new InProgressResult(player1.getScore(), player2.getScore());
        }
    }
}
