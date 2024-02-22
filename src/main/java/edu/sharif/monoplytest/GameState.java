package edu.sharif.monoplytest;

import edu.sharif.monoplytest.model.Player;
import edu.sharif.monoplytest.model.Tiles.ColoredTiles;
import edu.sharif.monoplytest.model.Tiles.GO;
import edu.sharif.monoplytest.model.Tiles.Tile;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GameState {
    public static ArrayList<Tile> tileList = new ArrayList<>();
    public static ArrayList<Player> playersList = new ArrayList<>();
    public static Player currentTurn;
    public static boolean canRollDice = false;

    public static void printGameStateInfo(){
        System.out.println("... Players Positions ...");
        for(Player player : GameState.playersList){
            System.out.println(player.playerId + " player : position is : " + player.getPosition() +  " --- balance is :" + player.getBalance());
        }
    }

}
