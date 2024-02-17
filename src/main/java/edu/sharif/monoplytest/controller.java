package edu.sharif.monoplytest;

import edu.sharif.monoplytest.model.Dice;
import edu.sharif.monoplytest.model.Player;
import edu.sharif.monoplytest.model.Tiles.ColoredTiles;
import edu.sharif.monoplytest.model.Tiles.GO;
import edu.sharif.monoplytest.model.Tiles.Tile;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;

import static edu.sharif.monoplytest.GameState.*;

public class controller {
    @FXML
    private Pane startGameButton;
    @FXML
    private Button goToNextButton;
    @FXML
    private Button diceRollerButton;
    @FXML
    private Button buyButton;
    @FXML
    private Button sellButton;
    @FXML
    private Label currentTurnLabel;
    @FXML
    private Label player1Balance;
    @FXML
    private Label player2Balance;
    @FXML
    private Label player3Balance;
    @FXML
    private Label player4Balance;
    //DiceRoller
    public static int dice1;
    private ArrayList<Image> dicePics = new ArrayList<Image>(){
        {
            add(new Image((new File("src/main/resources/edu/sharif/monoplytest/DicePics/1.png")).toURI().toString()));
            add(new Image((new File("src/main/resources/edu/sharif/monoplytest/DicePics/2.png")).toURI().toString()));
            add(new Image((new File("src/main/resources/edu/sharif/monoplytest/DicePics/3.png")).toURI().toString()));
            add(new Image((new File("src/main/resources/edu/sharif/monoplytest/DicePics/4.png")).toURI().toString()));
            add(new Image((new File("src/main/resources/edu/sharif/monoplytest/DicePics/5.png")).toURI().toString()));
            add(new Image((new File("src/main/resources/edu/sharif/monoplytest/DicePics/6.png")).toURI().toString()));
        }
    };
    @FXML
    private ImageView dice1Pic;
    @FXML
    public void diceRoller(){
        GameState.canRollDice = false;
        diceRollerButton.setDisable(true);
        goToNextButton.setDisable(false);
        Random random = new Random();
        dice1 = Dice.getDice();

        dice1Pic.setImage(dicePics.get(dice1 - 1));

        GameState.currentTurn.setPosition((GameState.currentTurn.getPosition() + dice1 ) % 39);

        //set the status of buy button
        if (getCurrentTileOfCurrentPlayer().getTileType().compareTo("ColoredTiles") == 0){
            if (((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner() ==null){
                if (((ColoredTiles)getCurrentTileOfCurrentPlayer()).getTilePrice() <= GameState.currentTurn.getBalance()){
                    buyButton.setDisable(false);
                }
            }

        }

    }
    //go to next turn
    @FXML
    public void goToNextTurn(){
        GameState.canRollDice = true;
        goToNextButton.setDisable(true);
        diceRollerButton.setDisable(false);
        buyButton.setDisable(true);
        for (int i = 0; i < GameState.playersList.size(); i++) {
            if (GameState.playersList.get(i).playerId == GameState.currentTurn.playerId){
                if (i == GameState.playersList.size() - 1){
                    GameState.currentTurn = GameState.playersList.getFirst();
                    break;
                }
                GameState.currentTurn = GameState.playersList.get(i+1);
                break;
            }
        }
        GameState.printGameStateInfo();
        currentTurnLabel.setText("Player " + String.valueOf(GameState.currentTurn.playerId) + "'s Turn");


    }
    @FXML
    public void buyButton(){
        //add the tile to the list of player's tiles
        Tile theCurrentTile = getCurrentTileOfCurrentPlayer();
        ArrayList<Tile> playerOwnedTiles = GameState.currentTurn.getOwnedTiles();
        ((ColoredTiles)theCurrentTile).setOwner(GameState.currentTurn);
        playerOwnedTiles.add(theCurrentTile);
        GameState.currentTurn.setOwnedTiles(playerOwnedTiles);
        //reduce the balance of the player
        GameState.currentTurn.setBalance(GameState.currentTurn.getBalance() - ((ColoredTiles)theCurrentTile).getTilePrice());

        //disable the buy button
        buyButton.setDisable(true);

        updatePlayersBalances();
    }
    @FXML
    void sellButton(){


        updatePlayersBalances();
    }
    @FXML
    void startButton(){
        startGameButton.setDisable(true);
        startGameButton.setOpacity(0);

        updatePlayersBalances();
        initializeTiles();
    }
    private void updatePlayersBalances(){
        player1Balance.setText("1$ : " + GameState.playersList.get(0).getBalance());
        player2Balance.setText("2$ : " + GameState.playersList.get(1).getBalance());
        player3Balance.setText("3$ : " + GameState.playersList.get(2).getBalance());
        player4Balance.setText("4$ : " + GameState.playersList.get(3).getBalance());
    }
    private void initializeTiles(){
        tileList.add(new GO(0 , 100));
        tileList.add(new ColoredTiles( 1,null , "BROWN" , "Danesh Kadeh Bargh1" , 100 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 2,null , "BROWN" , "Danesh Kadeh Bargh2" , 110 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 3,null , "BROWN" , "Danesh Kadeh Bargh3" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 4,null , "BROWN" , "Danesh Kadeh Bargh4" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 5,null , "BROWN" , "Danesh Kadeh Bargh5" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 6,null , "BROWN" , "Danesh Kadeh Bargh6" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 7,null , "BROWN" , "Danesh Kadeh Bargh7" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 8,null , "BROWN" , "Danesh Kadeh Bargh8" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 9,null , "BROWN" , "Danesh Kadeh Bargh9" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 10,null , "BROWN" , "Danesh Kadeh Bargh10" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 11,null , "BROWN" , "Danesh Kadeh Bargh11" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 12,null , "BROWN" , "Danesh Kadeh Bargh12" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 13,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
    }
    private Tile getCurrentTileOfCurrentPlayer(){
        int currentPosOfCurrentPlayer = GameState.currentTurn.getPosition();
        return tileList.get(currentPosOfCurrentPlayer);
    }
}
