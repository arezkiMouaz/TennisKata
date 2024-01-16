package org.ares.tennisgame;

import java.util.function.Supplier;

public class Arbitre {

    public static Supplier<String> determinerResultat(Player player1, Player player2) {
        if (player1.isEqualScore(player2)) {
            return () -> new ExecoResult(player1, player2).printScoreAsText();
        } else if (player1.eitherPlayerHasAdvantage(player2) && player1.eitherPlayerIsAheadByOne(player2)) {
            return () -> new AdvantageResult(player1, player2).printScoreAsText();
        } else if (player1.eitherPlayerHasAdvantage(player2)) {
            return () -> new WinResult(player1, player2).printScoreAsText();
        } else {
            return () -> new InProgressResult(player1, player2).printScoreAsText();
        }
    }
}
