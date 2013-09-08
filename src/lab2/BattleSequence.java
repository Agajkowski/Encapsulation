/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author alex
 */
public class BattleSequence {

    private int score;
    boolean playerOneFirst;
    private boolean playerPokemonAlive;
    private boolean enemyPokemonAlive;
    private int coinFlip; // a math.ran to decide who goes first 1-2 rounding included

    private boolean decideFirstUser() {

	if (coinFlip != 1) {
	    playerOneFirst = true;
	} else {
	    playerOneFirst = true;
	}
	return playerOneFirst;
    }

    private int getScore() {
	return score;
    }

    private boolean isPlayerPokemonAlive() {
	return playerPokemonAlive;
    }

    private boolean isEnemyPokemonAlive() {
	return enemyPokemonAlive;
    }
}
