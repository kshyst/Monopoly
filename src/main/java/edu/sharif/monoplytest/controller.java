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
import javafx.scene.shape.Circle;

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
    //circles
    @FXML
    private Circle circle1_0;
    @FXML
    private Circle circle1_1;
    @FXML
    private Circle circle1_2;
    @FXML
    private Circle circle1_3;
    @FXML
    private Circle circle1_4;
    @FXML
    private Circle circle1_5;
    @FXML
    private Circle circle1_6;
    @FXML
    private Circle circle1_7;
    @FXML
    private Circle circle1_8;
    @FXML
    private Circle circle1_9;
    @FXML
    private Circle circle1_10;
    @FXML
    private Circle circle1_11;
    @FXML
    private Circle circle1_12;
    @FXML
    private Circle circle1_13;
    @FXML
    private Circle circle1_14;
    @FXML
    private Circle circle1_15;
    @FXML
    private Circle circle1_16;
    @FXML
    private Circle circle1_17;
    @FXML
    private Circle circle1_18;
    @FXML
    private Circle circle1_19;
    @FXML
    private Circle circle1_20;
    @FXML
    private Circle circle1_21;
    @FXML
    private Circle circle1_22;
    @FXML
    private Circle circle1_23;
    @FXML
    private Circle circle1_24;
    @FXML
    private Circle circle1_25;
    @FXML
    private Circle circle1_26;
    @FXML
    private Circle circle1_27;

    @FXML
    private Circle circle2_0;
    @FXML
    private Circle circle2_1;
    @FXML
    private Circle circle2_2;
    @FXML
    private Circle circle2_3;
    @FXML
    private Circle circle2_4;
    @FXML
    private Circle circle2_5;
    @FXML
    private Circle circle2_6;
    @FXML
    private Circle circle2_7;
    @FXML
    private Circle circle2_8;
    @FXML
    private Circle circle2_9;
    @FXML
    private Circle circle2_10;
    @FXML
    private Circle circle2_11;
    @FXML
    private Circle circle2_12;
    @FXML
    private Circle circle2_13;
    @FXML
    private Circle circle2_14;
    @FXML
    private Circle circle2_15;
    @FXML
    private Circle circle2_16;
    @FXML
    private Circle circle2_17;
    @FXML
    private Circle circle2_18;
    @FXML
    private Circle circle2_19;
    @FXML
    private Circle circle2_20;
    @FXML
    private Circle circle2_21;
    @FXML
    private Circle circle2_22;
    @FXML
    private Circle circle2_23;
    @FXML
    private Circle circle2_24;
    @FXML
    private Circle circle2_25;
    @FXML
    private Circle circle2_26;
    @FXML
    private Circle circle2_27;

    @FXML
    private Circle circle3_0;
    @FXML
    private Circle circle3_1;
    @FXML
    private Circle circle3_2;
    @FXML
    private Circle circle3_3;
    @FXML
    private Circle circle3_4;
    @FXML
    private Circle circle3_5;
    @FXML
    private Circle circle3_6;
    @FXML
    private Circle circle3_7;
    @FXML
    private Circle circle3_8;
    @FXML
    private Circle circle3_9;
    @FXML
    private Circle circle3_10;
    @FXML
    private Circle circle3_11;
    @FXML
    private Circle circle3_12;
    @FXML
    private Circle circle3_13;
    @FXML
    private Circle circle3_14;
    @FXML
    private Circle circle3_15;
    @FXML
    private Circle circle3_16;
    @FXML
    private Circle circle3_17;
    @FXML
    private Circle circle3_18;
    @FXML
    private Circle circle3_19;
    @FXML
    private Circle circle3_20;
    @FXML
    private Circle circle3_21;
    @FXML
    private Circle circle3_22;
    @FXML
    private Circle circle3_23;
    @FXML
    private Circle circle3_24;
    @FXML
    private Circle circle3_25;
    @FXML
    private Circle circle3_26;
    @FXML
    private Circle circle3_27;

    @FXML
    private Circle circle4_0;
    @FXML
    private Circle circle4_1;
    @FXML
    private Circle circle4_2;
    @FXML
    private Circle circle4_3;
    @FXML
    private Circle circle4_4;
    @FXML
    private Circle circle4_5;
    @FXML
    private Circle circle4_6;
    @FXML
    private Circle circle4_7;
    @FXML
    private Circle circle4_8;
    @FXML
    private Circle circle4_9;
    @FXML
    private Circle circle4_10;
    @FXML
    private Circle circle4_11;
    @FXML
    private Circle circle4_12;
    @FXML
    private Circle circle4_13;
    @FXML
    private Circle circle4_14;
    @FXML
    private Circle circle4_15;
    @FXML
    private Circle circle4_16;
    @FXML
    private Circle circle4_17;
    @FXML
    private Circle circle4_18;
    @FXML
    private Circle circle4_19;
    @FXML
    private Circle circle4_20;
    @FXML
    private Circle circle4_21;
    @FXML
    private Circle circle4_22;
    @FXML
    private Circle circle4_23;
    @FXML
    private Circle circle4_24;
    @FXML
    private Circle circle4_25;
    @FXML
    private Circle circle4_26;
    @FXML
    private Circle circle4_27;

    public ArrayList<Circle> circleList = new ArrayList<Circle>();


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

        GameState.currentTurn.setPosition((GameState.currentTurn.getPosition() + dice1 ) % 28);

        //set the status of buy button
        if (getCurrentTileOfCurrentPlayer().getTileType().compareTo("ColoredTiles") == 0){
            if (((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner() ==null){
                if (((ColoredTiles)getCurrentTileOfCurrentPlayer()).getTilePrice() <= GameState.currentTurn.getBalance()){
                    buyButton.setDisable(false);
                }
            }
            else{
                //player on its owned tile
                if (((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner().arePlayersEqual(currentTurn.playerId)){

                }

                //get rent
                if (!((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner().arePlayersEqual(currentTurn.playerId)){
                    currentTurn.setBalance(currentTurn.getBalance() - ((ColoredTiles)getCurrentTileOfCurrentPlayer()).getTileRent());
                    updatePlayersBalances();
                }
            }
        }

        if (currentTurn.playerId <= 2){
            ((Pane)circleList.get(currentTurn.getPosition() + 28 * (currentTurn.playerId - 1)).getParent()).getChildren().add(playersList.get(currentTurn.playerId - 1).getPlayerNode());
            playersList.get(currentTurn.playerId - 1).getPlayerNode().setLayoutX(circleList.get(currentTurn.getPosition() + 28 * (currentTurn.playerId - 1)).getLayoutX());
            playersList.get(currentTurn.playerId - 1).getPlayerNode().setLayoutY(circleList.get(currentTurn.getPosition() + 28 * (currentTurn.playerId - 1)).getLayoutY());
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

        circleList.add(circle1_0);
        circleList.add(circle1_1);
        circleList.add(circle1_2);
        circleList.add(circle1_3);
        circleList.add(circle1_4);
        circleList.add(circle1_5);
        circleList.add(circle1_6);
        circleList.add(circle1_7);
        circleList.add(circle1_8);
        circleList.add(circle1_9);
        circleList.add(circle1_10);
        circleList.add(circle1_11);
        circleList.add(circle1_12);
        circleList.add(circle1_13);
        circleList.add(circle1_14);
        circleList.add(circle1_15);
        circleList.add(circle1_16);
        circleList.add(circle1_17);
        circleList.add(circle1_18);
        circleList.add(circle1_19);
        circleList.add(circle1_20);
        circleList.add(circle1_21);
        circleList.add(circle1_22);
        circleList.add(circle1_23);
        circleList.add(circle1_24);
        circleList.add(circle1_25);
        circleList.add(circle1_26);
        circleList.add(circle1_27);
        circleList.add(circle2_0);
        circleList.add(circle2_1);
        circleList.add(circle2_2);
        circleList.add(circle2_3);
        circleList.add(circle2_4);
        circleList.add(circle2_5);
        circleList.add(circle2_6);
        circleList.add(circle2_7);
        circleList.add(circle2_8);
        circleList.add(circle2_9);
        circleList.add(circle2_10);
        circleList.add(circle2_11);
        circleList.add(circle2_12);
        circleList.add(circle2_13);
        circleList.add(circle2_14);
        circleList.add(circle2_15);
        circleList.add(circle2_16);
        circleList.add(circle2_17);
        circleList.add(circle2_18);
        circleList.add(circle2_19);
        circleList.add(circle2_20);
        circleList.add(circle2_21);
        circleList.add(circle2_22);
        circleList.add(circle2_23);
        circleList.add(circle2_24);
        circleList.add(circle2_25);
        circleList.add(circle2_26);
        circleList.add(circle2_27);
        circleList.add(circle3_0);
        circleList.add(circle3_1);
        circleList.add(circle3_2);
        circleList.add(circle3_3);
        circleList.add(circle3_4);
        circleList.add(circle3_5);
        circleList.add(circle3_6);
        circleList.add(circle3_7);
        circleList.add(circle3_8);
        circleList.add(circle3_9);
        circleList.add(circle3_10);
        circleList.add(circle3_11);
        circleList.add(circle3_12);
        circleList.add(circle3_13);
        circleList.add(circle3_14);
        circleList.add(circle3_15);
        circleList.add(circle3_16);
        circleList.add(circle3_17);
        circleList.add(circle3_18);
        circleList.add(circle3_19);
        circleList.add(circle3_20);
        circleList.add(circle3_21);
        circleList.add(circle3_22);
        circleList.add(circle3_23);
        circleList.add(circle3_24);
        circleList.add(circle3_25);
        circleList.add(circle3_26);
        circleList.add(circle3_27);
        circleList.add(circle4_1);
        circleList.add(circle4_2);
        circleList.add(circle4_3);
        circleList.add(circle4_4);
        circleList.add(circle4_5);
        circleList.add(circle4_6);
        circleList.add(circle4_7);
        circleList.add(circle4_8);
        circleList.add(circle4_9);
        circleList.add(circle4_10);
        circleList.add(circle4_11);
        circleList.add(circle4_12);
        circleList.add(circle4_13);
        circleList.add(circle4_14);
        circleList.add(circle4_15);
        circleList.add(circle4_16);
        circleList.add(circle4_17);
        circleList.add(circle4_18);
        circleList.add(circle4_19);
        circleList.add(circle4_20);
        circleList.add(circle4_21);
        circleList.add(circle4_22);
        circleList.add(circle4_23);
        circleList.add(circle4_24);
        circleList.add(circle4_25);
        circleList.add(circle4_26);
        circleList.add(circle4_27);

        ((Pane)circleList.get(0).getParent()).getChildren().add(playersList.get(0).getPlayerNode());
        playersList.get(0).getPlayerNode().setLayoutX(circleList.get(0).getLayoutX());
        playersList.get(0).getPlayerNode().setLayoutY(circleList.get(0).getLayoutY());

        ((Pane)circleList.get(28).getParent()).getChildren().add(playersList.get(1).getPlayerNode());
        playersList.get(1).getPlayerNode().setLayoutX(circleList.get(28).getLayoutX());
        playersList.get(1).getPlayerNode().setLayoutY(circleList.get(28).getLayoutY());

        /*((Pane)circleList.get(56).getParent()).getChildren().add(playersList.get(2).getPlayerNode());
        playersList.get(2).getPlayerNode().setLayoutX(circleList.get(56).getLayoutX());
        playersList.get(2).getPlayerNode().setLayoutY(circleList.get(56).getLayoutY());

        ((Pane)circleList.get(84).getParent()).getChildren().add(playersList.get(0).getPlayerNode());
        playersList.get(3).getPlayerNode().setLayoutX(circleList.get(84).getLayoutX());
        playersList.get(3).getPlayerNode().setLayoutY(circleList.get(84).getLayoutY());*/
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
        tileList.add(new ColoredTiles( 14,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 15,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 16,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 17,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 18,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 19,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 20,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 21,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 22,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 23,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 24,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 25,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 26,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
        tileList.add(new ColoredTiles( 27,null , "BROWN" , "Danesh Kadeh Bargh13" , 120 , 20 , 0 ,0 ,110 ));
    }
    private Tile getCurrentTileOfCurrentPlayer(){
        int currentPosOfCurrentPlayer = GameState.currentTurn.getPosition();
        return tileList.get(currentPosOfCurrentPlayer);
    }
}
