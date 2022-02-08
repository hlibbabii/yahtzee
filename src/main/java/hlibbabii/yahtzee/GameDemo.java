package hlibbabii.yahtzee;

import hlibbabii.yahtzee.gameplay.Game;
import hlibbabii.yahtzee.gameplay.GameStats;
import hlibbabii.yahtzee.player.DummyPlayer;

public class GameDemo {
    public static void main(String[] args) {
        Player player1 = new DummyPlayer();
        Player player2 = new DummyPlayer();

        Game yahtzeeGame = new Game(player1, player2);

        GameStats gameStats = yahtzeeGame.play();
        System.out.println("Player1");
        System.out.println(gameStats.getPlayerStats(player1));
        System.out.println("Player2");
        System.out.println(gameStats.getPlayerStats(player2));

    }
}
