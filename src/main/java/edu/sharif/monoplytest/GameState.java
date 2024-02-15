package edu.sharif.monoplytest;

import edu.sharif.monoplytest.model.Player;

import java.util.ArrayList;

public class GameState {
    public static ArrayList<Player> playersList = new ArrayList<Player>();
    public static Player currentTurn;
    public static boolean canRollDice = false;

    public static void printGameStateInfo(){
        System.out.println("... Players Positions ...");
        for(Player player : GameState.playersList){
            System.out.println(player.playerId + "player's position is : " + player.getPosition());
        }
    }

}
