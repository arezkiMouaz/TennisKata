import org.ares.tennisgame.TennisGame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {

    private final TennisGame tennisGame = new TennisGame("A", "B");

    @Test
    public void new_game_should_return_love_all_test() {
        //GIVEN
        String expectedScore = "Love-All";
        //WHEN
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_fifteen_for_player_A_test() {
        //GIVEN
        String expectedScore = "Fifteen/Love";
        //WHEN
        tennisGame.winPoint("A");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_fifty_for_player_A_test() {
        //GIVEN
        String expectedScore = "Thirty/Love";
        //WHEN
        getScoreFromSequence("AA");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_forty_for_player_A_test() {
        //GIVEN
        String expectedScore = "Forty/Love";
        //WHEN
        getScoreFromSequence("AAA");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_deuce_test() {
        //GIVEN
        String expectedScore = "Deuce";
        //WHEN
        getScoreFromSequence("AAABBB");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_deuce4_test() {
        //GIVEN
        String expectedScore = "Deuce";
        //WHEN
        getScoreFromSequence("AAAABBBB");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_player_A_advantage_test() {
        //GIVEN
        String expectedScore = "Advantage Player A";
        //WHEN
        getScoreFromSequence("AAAAABBBB");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_player_B_advantage_test() {
        //GIVEN
        String expectedScore = "Advantage Player B";
        //WHEN
        getScoreFromSequence("AAAABBBBB");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_player_A_wins_after_advantage_test() {
        //GIVEN
        String expectedScore = "Win for Player A";
        //WHEN
        getScoreFromSequence("AAAAAAABBBBB");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_player_B_wins_after_advantage_test() {
        //GIVEN
        String expectedScore = "Win for Player B";
        //WHEN
        getScoreFromSequence("AAAAABBBBBBB");
        String score = tennisGame.getScore();
        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    void should_return_score_kata_example_test() {
        //GIVEN
        String expectedScore =
                "Fifteen/Love" + "\n"
                        + "Fifteen-All" + "\n"
                        + "Thirty/Fifteen" + "\n"
                        + "Thirty-All" + "\n"
                        + "Forty/Thirty" + "\n"
                        + "Win for Player A";

        //WHEN
        String score = getScoreFromSequence("ABABAA");

        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    void should_return_score_resultat_back_to_deuce_test() {
        //GIVEN
        String expectedScore =
                "Fifteen/Love" + "\n"
                        + "Fifteen-All" + "\n"
                        + "Thirty/Fifteen" + "\n"
                        + "Thirty-All" + "\n"
                        + "Forty/Thirty" + "\n"
                        + "Deuce" + "\n"
                        + "Advantage Player A" + "\n"
                        + "Deuce" + "\n"
                        + "Advantage Player A" + "\n"
                        + "Win for Player A";

        //WHEN
        String score = getScoreFromSequence("ABABABABAA");

        //THEN
        assertThat(score).isEqualTo(expectedScore);
    }

    public String getScoreFromSequence(String scoreSequence) {
        StringBuilder score = new StringBuilder();
        for (char player : scoreSequence.toCharArray()) {
            tennisGame.winPoint(String.valueOf(player));
            score.append(tennisGame.getScore());
            score.append(System.lineSeparator());
        }
        return score.toString().trim();
    }
}
