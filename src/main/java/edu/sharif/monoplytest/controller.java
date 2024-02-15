package edu.sharif.monoplytest;

import edu.sharif.monoplytest.model.Dice;
import edu.sharif.monoplytest.model.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;

public class controller {
    @FXML
    private Button goToNextButton;
    @FXML
    private Button diceRollerButton;
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
    }
    //go to next turn
    @FXML
    public void goToNextTurn(){
        GameState.canRollDice = true;
        goToNextButton.setDisable(true);
        diceRollerButton.setDisable(false);
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
    }

}
