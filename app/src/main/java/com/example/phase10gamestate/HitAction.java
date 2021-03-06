/**
* @author Kirsten Foster, Alexis Molina, Emily Hoppe, Grace Penunuri
 * Holds information about each card (particularly number and color)
 * Also includes getters/setters for card info
 * Includes a "to string" method to explain what the card is
*/

package com.example.phase10gamestate;

/*
EXTERNAL CITATION https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
 */
import edu.up.cs301.game.Game;
import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.actionMsg.GameAction;

public class HitAction extends GameAction {
    private Card card;
    private int hitOn;
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public HitDownAction(GamePlayer player, Card card, int hitOn) {
        super(player);
        this.card = card;
        this.hitOn = hitOn;
    }

    public Card getCard() {
        return card;
    }
}