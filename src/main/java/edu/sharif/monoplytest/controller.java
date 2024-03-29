package edu.sharif.monoplytest;

import edu.sharif.monoplytest.model.ChanceCard;
import edu.sharif.monoplytest.model.Dice;
import edu.sharif.monoplytest.model.Ethnicity;
import edu.sharif.monoplytest.model.Tiles.*;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import static edu.sharif.monoplytest.GameState.*;
import static edu.sharif.monoplytest.Main.scene;
import static edu.sharif.monoplytest.model.Ethnicity.ethnicityList;

public class controller implements Initializable {
    private String player1SelectedTileFromList;
    private String player2SelectedTileFromList;
    private String player3SelectedTileFromList;
    private String player4SelectedTileFromList;
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
    private Button chanceButton;
    @FXML
    private ChoiceBox<String> playerCount;
    @FXML
    public ListView<String> ownedTiles1 = new ListView<>();
    @FXML
    public ListView<String> ownedTiles2 = new ListView<>();
    @FXML
    public ListView<String> ownedTiles3 = new ListView<>();
    @FXML
    public ListView<String> ownedTiles4 = new ListView<>();
    @FXML
    private ComboBox<String> player1Ethnicity;
    @FXML
    private ComboBox<String> player2Ethnicity;
    @FXML
    private ComboBox<String> player3Ethnicity;
    @FXML
    private ComboBox<String> player4Ethnicity;

    //plauers info
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
    @FXML
    private Label gameLog;
    @FXML
    private TextField player1UserName;
    @FXML
    private TextField player2UserName;
    @FXML
    private TextField player3UserName;
    @FXML
    private TextField player4UserName;
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

    public static ArrayList<Circle> circleList = new ArrayList<Circle>();
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
        Random random = new Random();
        dice1 = Dice.getDice();
        if(dice1 == 6){
            canRollDice = true;
            diceRollerButton.setDisable(false);
            goToNextButton.setDisable(true);
        }
        else {
            canRollDice = false;
            diceRollerButton.setDisable(true);
            goToNextButton.setDisable(false);
        }

        dice1Pic.setImage(dicePics.get(dice1 - 1));

        currentTurn.setPosition((currentTurn.getPosition() + dice1 ) % 28);


        final Point2D windowCoord = new Point2D(scene.getWindow().getX(), scene.getWindow().getY());
        final Point2D sceneCoord = new Point2D(scene.getX(), scene.getY());
        int prevPosition = (currentTurn.getPosition() - dice1) % 28;
        if (prevPosition < 0){
            prevPosition+=28;
        }
        final Point2D nodeCoord1 = circleList.get(prevPosition + 28 * (currentTurn.playerId - 1)).localToScene(0.0, 0.0);
        final Point2D nodeCoord2 = circleList.get(currentTurn.getPosition() + 28 * (currentTurn.playerId - 1)).localToScene(0.0, 0.0);

        final double currentTileX = Math.round(windowCoord.getX() + sceneCoord.getX() + nodeCoord1.getX());
        final double currentTileY = Math.round(windowCoord.getY() + sceneCoord.getY() + nodeCoord1.getY());

        final double nextTileX = Math.round(windowCoord.getX() + sceneCoord.getX() + nodeCoord2.getX());
        final double nextTileY = Math.round(windowCoord.getY() + sceneCoord.getY() + nodeCoord2.getY());

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(playersList.get(currentTurn.playerId - 1).getPlayerNode());
        translateTransition.setDuration(Duration.seconds(1));
        translateTransition.setByX(nextTileX - currentTileX);
        translateTransition.setByY(nextTileY - currentTileY);
        translateTransition.play();

        //set the status of buy button
        if (getCurrentTileOfCurrentPlayer().getTileType().compareTo("ColoredTiles") == 0){
            if (((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner() ==null){
                if (((ColoredTiles)getCurrentTileOfCurrentPlayer()).getTilePrice() <= currentTurn.getBalance()){
                    buyButton.setDisable(false);
                    buyButton.setText("BUY" + ((ColoredTiles) getCurrentTileOfCurrentPlayer()).getTileName());
                }
            }
            else{
                //player on its owned tile
                if (((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner().arePlayersEqual(currentTurn.playerId)){

                }

                //get rent
                if (!((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner().arePlayersEqual(currentTurn.playerId)){
                    currentTurn.setBalance(currentTurn.getBalance() - ((ColoredTiles)getCurrentTileOfCurrentPlayer()).getTileRent());
                    ((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner().setBalance(((ColoredTiles)getCurrentTileOfCurrentPlayer()).getOwner().getBalance() + ((ColoredTiles)getCurrentTileOfCurrentPlayer()).getTileRent());
                    gameLog.setText(currentTurn.getPlayerUserName() + " payed " + ((ColoredTiles) getCurrentTileOfCurrentPlayer()).getTileRent() + "$ as rent to " + ((ColoredTiles) getCurrentTileOfCurrentPlayer()).getOwner().getPlayerUserName());
                    updatePlayersBalances();
                }
            }
        }

        //jail
        if (getCurrentTileOfCurrentPlayer().getTileType().equals("Jail")){
            currentTurn.setJailTime(1);
            gameLog.setText(currentTurn.getPlayerUserName() + " went to herasat for " + currentTurn.getJailTime() + " rounds");
        }

        //Go
        if(getCurrentTileOfCurrentPlayer().getTileType().equals("GO")){
            if (((GO)getCurrentTileOfCurrentPlayer()).getName().equals("dar")){
                currentTurn.setBalance(currentTurn.getBalance() + ((GO)getCurrentTileOfCurrentPlayer()).getSalary());
                gameLog.setText(currentTurn.getPlayerUserName() + " earned" + ((GO)getCurrentTileOfCurrentPlayer()).getSalary() + "$ for passing dar energy");
                updatePlayersBalances();
            }
            else if (((GO)getCurrentTileOfCurrentPlayer()).getName().equals("self")){
                currentTurn.setBalance(currentTurn.getBalance() + ((GO)getCurrentTileOfCurrentPlayer()).getSalary());
                gameLog.setText(currentTurn.getPlayerUserName() + " spent " + ((GO)getCurrentTileOfCurrentPlayer()).getSalary() * -1 + "$ for eating at self");
                updatePlayersBalances();
            }
            else {
                currentTurn.setBalance(currentTurn.getBalance() + ((GO)getCurrentTileOfCurrentPlayer()).getSalary());
                gameLog.setText(currentTurn.getPlayerUserName() + " spent " + ((GO)getCurrentTileOfCurrentPlayer()).getSalary() * -1 + "$ for parking");
                updatePlayersBalances();
            }
        }

        //Chance
        if(getCurrentTileOfCurrentPlayer().getTileType().equals("Chance")){
            chanceButton.setText("pick a chance card");
            chanceButton.setDisable(false);
        }
    }
    @FXML
    public void goToNextTurn(){
        canRollDice = true;
        goToNextButton.setDisable(true);
        diceRollerButton.setDisable(false);
        buyButton.setDisable(true);
        for (int i = 0; i < playersList.size(); i++) {
            if (playersList.get(i).playerId == currentTurn.playerId){
                if (i == playersList.size() - 1){
                    currentTurn = playersList.getFirst();
                    if (!currentTurn.isInTheGame()){
                        goToNextTurn();
                    }
                    if (currentTurn.getJailTime() > 0){
                        currentTurn.setJailTime(currentTurn.getJailTime() - 1);
                        gameLog.setText(currentTurn.getPlayerUserName()+ " is in herasat for " + currentTurn.getJailTime() + " more rounds");
                        goToNextTurn();
                    }
                    break;
                }
                currentTurn = playersList.get(i+1);
                if (!currentTurn.isInTheGame()){
                    goToNextTurn();
                }
                if (currentTurn.getJailTime() > 0){
                    currentTurn.setJailTime(currentTurn.getJailTime() - 1);
                    gameLog.setText(currentTurn.getPlayerUserName()+ " is in herasat for " + currentTurn.getJailTime() + " more rounds");
                    goToNextTurn();
                }
                break;
            }
        }
        printGameStateInfo();
        currentTurnLabel.setText(currentTurn.getPlayerUserName() + "'s Turn");

        sellButton.setDisable(true);
        buyButton.setDisable(true);
        sellButton.setText("");
        buyButton.setText("");

        ownedTiles1.setDisable(true);
        ownedTiles2.setDisable(true);
        ownedTiles3.setDisable(true);
        ownedTiles4.setDisable(true);

        switch (currentTurn.playerId){
            case 1:
                ownedTiles1.setDisable(false);
                break;
            case 2:
                ownedTiles2.setDisable(false);
                break;
            case 3:
                ownedTiles3.setDisable(false);
                break;
            case 4:
                ownedTiles4.setDisable(false);
                break;
            default:
                break;
        }

    }
    @FXML
    public void buyButton(){
        //add the tile to the list of player's tiles
        Tile theCurrentTile = getCurrentTileOfCurrentPlayer();
        ArrayList<Tile> playerOwnedTiles = currentTurn.getOwnedTiles();
        ((ColoredTiles)theCurrentTile).setOwner(currentTurn);
        playerOwnedTiles.add(theCurrentTile);
        currentTurn.setOwnedTiles(playerOwnedTiles);

        //reduce the balance of the player
        currentTurn.setBalance(currentTurn.getBalance() - ((ColoredTiles)theCurrentTile).getTilePrice());

        //disable the buy button
        buyButton.setDisable(true);
        buyButton.setText("");
        //change ownedTiles list

        updatePlayerTileList();
        updatePlayersBalances();
        sellButton.setDisable(true);

        gameLog.setText(currentTurn.getPlayerUserName() + " bought " + ((ColoredTiles) theCurrentTile).getTileName());
    }
    @FXML
    void sellButton(){
        String selectedTile = null;
        switch (currentTurn.playerId){
            case 1:
                selectedTile = player1SelectedTileFromList;
                break;
            case 2:
                selectedTile = player2SelectedTileFromList;
                break;
            case 3:
                selectedTile = player3SelectedTileFromList;
                break;
            case 4:
                selectedTile = player4SelectedTileFromList;
                break;
            default:
                break;
        }

        for (Tile tile : tileList){
            if (tile.getTileType().equals("ColoredTiles")){
                if (((ColoredTiles)tile).getTileName().equals(selectedTile)){
                    ((ColoredTiles) tile).setOwner(null);
                    currentTurn.setBalance(currentTurn.getBalance() + ((ColoredTiles) tile).getTilePrice());
                    break;
                }
            }
        }

        for (Tile tile : currentTurn.getOwnedTiles()){
            if (((ColoredTiles)tile).getTileName().equals(selectedTile)){
                currentTurn.getOwnedTiles().remove(tile);
                break;
            }
        }

        updatePlayerTileList();
        updatePlayersBalances();
        sellButton.setDisable(true);
        sellButton.setText("");

        gameLog.setText(currentTurn.getPlayerUserName() + " sold " + selectedTile);
    }
    @FXML
    void startButton(){
        for (int i = 0; i < GameState.playerCount; i++) {
            playersList.get(i).setInTheGame(true);
        }

        playersList.get(0).setPlayerUserName(player1UserName.getText());
        playersList.get(1).setPlayerUserName(player2UserName.getText());
        playersList.get(2).setPlayerUserName(player3UserName.getText());
        playersList.get(3).setPlayerUserName(player4UserName.getText());

        startGameButton.setDisable(true);
        startGameButton.setOpacity(0);
        currentTurnLabel.setText(currentTurn.getPlayerUserName() + "'s Turn");
        updatePlayerTileList();
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
        circleList.add(circle4_0);
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

        final Point2D windowCoord = new Point2D(scene.getWindow().getX(), scene.getWindow().getY());
        final Point2D sceneCoord = new Point2D(scene.getX(), scene.getY());
        int prevPosition = (currentTurn.getPosition() - dice1) % 28;
        if (prevPosition < 0){
            prevPosition+=28;
        }
        final Point2D nodeCoord1 = circleList.get(0).localToScene(0.0, 0.0);
        final Point2D nodeCoord2 = circleList.get(28).localToScene(0.0, 0.0);
        final Point2D nodeCoord3 = circleList.get(56).localToScene(0.0, 0.0);
        final Point2D nodeCoord4 = circleList.get(84).localToScene(0.0, 0.0);

        final double currentTileX1 = Math.round(windowCoord.getX() + sceneCoord.getX() + nodeCoord1.getX());
        final double currentTileY1 = Math.round(windowCoord.getY() + sceneCoord.getY() + nodeCoord1.getY());
        final double currentTileX2 = Math.round(windowCoord.getX() + sceneCoord.getX() + nodeCoord2.getX());
        final double currentTileY2 = Math.round(windowCoord.getY() + sceneCoord.getY() + nodeCoord2.getY());
        final double currentTileX3 = Math.round(windowCoord.getX() + sceneCoord.getX() + nodeCoord3.getX());
        final double currentTileY3 = Math.round(windowCoord.getY() + sceneCoord.getY() + nodeCoord3.getY());
        final double currentTileX4 = Math.round(windowCoord.getX() + sceneCoord.getX() + nodeCoord4.getX());
        final double currentTileY4 = Math.round(windowCoord.getY() + sceneCoord.getY() + nodeCoord4.getY());


        playersList.get(0).getPlayerNode().setTranslateX(20);
        playersList.get(0).getPlayerNode().setTranslateY(800);

        playersList.get(1).getPlayerNode().setTranslateX(20);
        playersList.get(1).getPlayerNode().setTranslateY(820);

        playersList.get(2).getPlayerNode().setTranslateX(40);
        playersList.get(2).getPlayerNode().setTranslateY(800);

        playersList.get(3).getPlayerNode().setTranslateX(40);
        playersList.get(3).getPlayerNode().setTranslateY(820);

    }
    @FXML
    void chanceCardPicker(){
        ChanceCard.applyChanceCard(ChanceCard.getRandomChanceCard() , gameLog);
        chanceButton.setDisable(true);
        chanceButton.setText("");
        updatePlayersBalances();
    }
    private void updatePlayersBalances(){
        if (playersList.get(0).isInTheGame()){
            player1Balance.setText( playersList.get(0).getPlayerUserName() + "'s balance : " + playersList.get(0).getBalance());
            player1Balance.setVisible(true);
        }
        if (playersList.get(1).isInTheGame()){
            player2Balance.setText( playersList.get(1).getPlayerUserName() + "'s balance : " + playersList.get(1).getBalance());
            player2Balance.setVisible(true);
        }
        if (playersList.get(2).isInTheGame()){
            player3Balance.setText( playersList.get(2).getPlayerUserName() + "'s balance : " + playersList.get(2).getBalance());
            player3Balance.setVisible(true);
        }
        if (playersList.get(3).isInTheGame()){
            player4Balance.setText( playersList.get(3).getPlayerUserName() + "'s balance : " + playersList.get(3).getBalance());
            player4Balance.setVisible(true);
        }
    }
    private void initializeTiles(){
        tileList.add(new GO(0 , 1000 , "dar"));
        tileList.add(new ColoredTiles( 1,null , "GREEN" , "kelisa" , 100 , 20 , 0 , 110 ));
        tileList.add(new ColoredTiles( 2,null , "GREEN" , "arsheh" , 120 , 25 , 0 , 150 ));
        tileList.add(new ColoredTiles( 3,null , "GRAY" , "newyork" , 150 , 30 , 0 , 200 ));
        tileList.add(new ColoredTiles( 4,null , "BLUE" , "avang" , 160 , 40 , 0 , 200 ));
        tileList.add(new Chance(5));
        tileList.add(new ColoredTiles( 6,null , "BLUE" , "abdoos" , 170 , 45 , 0 , 210 ));
        tileList.add(new GO(0 , -5 , "self"));
        tileList.add(new ColoredTiles( 8,null , "LIME" , "bastani tarasht" , 180 , 50 , 0 , 220 ));
        tileList.add(new ColoredTiles( 9,null , "LIME" , "kiloei" , 190 , 55 , 0 , 220 ));
        tileList.add(new ColoredTiles( 10,null , "YELLOW" , "markaz graphic" , 200 , 60 , 0 , 250 ));
        tileList.add(new Chance(11));
        tileList.add(new ColoredTiles( 12,null , "YELLOW" , "alef 0" , 220 , 65 , 0 , 250 ));
        tileList.add(new ColoredTiles( 13,null , "YELLOW" , "anjooman eslaami" , 230 , 70 , 0 , 250 ));
        tileList.add(new Jail(14));
        tileList.add(new ColoredTiles( 15,null , "BROWN" , "cluna" , 250 , 80 , 0 , 300 ));
        tileList.add(new ColoredTiles( 16,null , "BROWN" , "ghorfeh soboone" , 260 , 85 , 0 , 300 ));
        tileList.add(new ColoredTiles( 17,null , "GRAY" , "jakooz" , 280 , 90 , 0 , 350 ));
        tileList.add(new Chance(18));
        tileList.add(new ColoredTiles( 19,null , "PINK" , "library markazi" , 300 , 100 , 0 , 400 ));
        tileList.add(new ColoredTiles( 20,null , "PINK" , "jabari" , 320 , 105 , 0 , 400 ));
        tileList.add(new GO(21 , -10 , "parking"));
        tileList.add(new ColoredTiles( 22,null , "PURPLE" , "sharif fast food" , 360 , 110 , 0 , 450 ));
        tileList.add(new ColoredTiles( 23,null , "PURPLE" , "sharif plus" , 380 , 115 , 0 , 450 ));
        tileList.add(new ColoredTiles( 24,null , "RED" , "lobby" , 400 , 120 , 0 , 500 ));
        tileList.add(new ColoredTiles( 25,null , "GRAY" , "loop" , 430 , 125 , 0 , 500 ));
        tileList.add(new ColoredTiles( 26,null , "RED" , "aquarium" , 450 , 130 , 0 , 500 ));
        tileList.add(new ColoredTiles( 27,null , "RED" , "dakhme" , 500 , 140 , 0 , 500 ));
    }
    private Tile getCurrentTileOfCurrentPlayer(){
        int currentPosOfCurrentPlayer = currentTurn.getPosition();
        return tileList.get(currentPosOfCurrentPlayer);
    }
    private void updatePlayerTileList(){
        switch (currentTurn.playerId){
            case 1 :
                ownedTiles1.getItems().clear();
                for (Tile tile : playersList.get(0).getOwnedTiles()){
                    ownedTiles1.getItems().add(((ColoredTiles)tile).getTileName() + " - rent: " +  ((ColoredTiles) tile).getTileRent());
                }
                break;
            case 2 :
                ownedTiles2.getItems().clear();
                for (Tile tile : playersList.get(1).getOwnedTiles()){
                    ownedTiles2.getItems().add(((ColoredTiles)tile).getTileName() + " - rent: " +  ((ColoredTiles) tile).getTileRent());
                }
                break;
            case 3 :
                ownedTiles3.getItems().clear();
                for (Tile tile : playersList.get(2).getOwnedTiles()){
                    ownedTiles3.getItems().add(((ColoredTiles)tile).getTileName() + " - rent: " +  ((ColoredTiles) tile).getTileRent());
                }
                break;
            case 4 :
                ownedTiles4.getItems().clear();
                for (Tile tile : playersList.get(3).getOwnedTiles()){
                    ownedTiles4.getItems().add(((ColoredTiles)tile).getTileName() + " - rent: " +  ((ColoredTiles) tile).getTileRent());
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        playerCount.setItems(FXCollections.observableArrayList(new ArrayList<String>(){
            {
                add("2");
                add("3");
                add("4");
            }
        }));
        playerCount.setValue("4");
        playerCount.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                GameState.playerCount = Integer.valueOf(playerCount.getSelectionModel().getSelectedIndex() + 2);

                switch (GameState.playerCount){
                    case 2:
                        player1UserName.setDisable(false);
                        player2UserName.setDisable(false);
                        player3UserName.setDisable(true);
                        player4UserName.setDisable(true);
                        break;
                    case 3:
                        player1UserName.setDisable(false);
                        player2UserName.setDisable(false);
                        player3UserName.setDisable(false);
                        player4UserName.setDisable(true);
                        break;
                    case 4:
                        player1UserName.setDisable(false);
                        player2UserName.setDisable(false);
                        player3UserName.setDisable(false);
                        player4UserName.setDisable(false);
                        break;
                    default:
                        break;
                }
            }
        });


        Ethnicity jewish = new Ethnicity("jewish" , 1 , 0.8 , 0.2 , 0);
        Ethnicity black = new Ethnicity("black" , 0.2 , 0.5 , 0 , 0.1 );
        Ethnicity redNeck = new Ethnicity("redNeck" , 0.6 , 0.5 , 1 , 0.5);
        Ethnicity blondeWhiteWoman = new Ethnicity("blondeWhiteWoman" , 0 , 1 , 1 , 1);
        Ethnicity asian = new Ethnicity("asian" , 0.9 , 0.6 , 0.5 , 0.3);
        Ethnicity persian = new Ethnicity("persian" , 0.1 , 1 , 1 , 0);

        player1Ethnicity.setItems(FXCollections.observableArrayList(ethnicityList));
        player2Ethnicity.setItems(FXCollections.observableArrayList(ethnicityList));
        player3Ethnicity.setItems(FXCollections.observableArrayList(ethnicityList));
        player4Ethnicity.setItems(FXCollections.observableArrayList(ethnicityList));

        player1Ethnicity.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                playersList.get(0).setPlayersEthnicity(Ethnicity.findEthnicity(player1Ethnicity.getSelectionModel().getSelectedItem()));
            }
        });
        player2Ethnicity.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                playersList.get(1).setPlayersEthnicity(Ethnicity.findEthnicity(player1Ethnicity.getSelectionModel().getSelectedItem()));
            }
        });
        player3Ethnicity.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                playersList.get(2).setPlayersEthnicity(Ethnicity.findEthnicity(player1Ethnicity.getSelectionModel().getSelectedItem()));
            }
        });
        player4Ethnicity.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                playersList.get(3).setPlayersEthnicity(Ethnicity.findEthnicity(player1Ethnicity.getSelectionModel().getSelectedItem()));
            }
        });
        //get the selected tile from the tile list
        ownedTiles1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                String selectedItemTitle1 = "";
                for (int i = 1; i < String.valueOf(ownedTiles1.getSelectionModel().getSelectedItems()).length() - 1; i++) {
                    selectedItemTitle1 += String.valueOf(ownedTiles1.getSelectionModel().getSelectedItems()).charAt(i);
                }

                player1SelectedTileFromList = selectedItemTitle1;

                sellButton.setText("Sell " + player1SelectedTileFromList);
                sellButton.setDisable(false);
            }
        });

        ownedTiles2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                String selectedItemTitle2 = "";
                for (int i = 1; i < String.valueOf(ownedTiles2.getSelectionModel().getSelectedItems()).length() - 1; i++) {
                    selectedItemTitle2 += String.valueOf(ownedTiles2.getSelectionModel().getSelectedItems()).charAt(i);
                }

                player2SelectedTileFromList = selectedItemTitle2;

                sellButton.setText("Sell " + player2SelectedTileFromList);
                sellButton.setDisable(false);
            }
        });

        ownedTiles3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                String selectedItemTitle3 = "";
                for (int i = 1; i < String.valueOf(ownedTiles3.getSelectionModel().getSelectedItems()).length() - 1; i++) {
                    selectedItemTitle3 += String.valueOf(ownedTiles3.getSelectionModel().getSelectedItems()).charAt(i);
                }

                player3SelectedTileFromList = selectedItemTitle3;

                sellButton.setText("Sell " + player3SelectedTileFromList);
                sellButton.setDisable(false);
            }
        });

        ownedTiles4.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                String selectedItemTitle4 = "";
                for (int i = 1; i < String.valueOf(ownedTiles4.getSelectionModel().getSelectedItems()).length() - 1; i++) {
                    selectedItemTitle4 += String.valueOf(ownedTiles4.getSelectionModel().getSelectedItems()).charAt(i);
                }

                player4SelectedTileFromList = selectedItemTitle4;

                sellButton.setText("Sell " + player4SelectedTileFromList);
                sellButton.setDisable(false);
            }
        });
    }
}
