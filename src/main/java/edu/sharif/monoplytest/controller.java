package edu.sharif.monoplytest;

import edu.sharif.monoplytest.model.Dice;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;

public class controller {
    //DiceRoller
    public int dice1;
    public int dice2;
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
    private ImageView dice2Pic;
    @FXML
    public void diceRoller(){
        System.out.println("Button Pressed");

        Random random = new Random();
        dice1 = Dice.getDice();
        dice2 = Dice.getDice();

        dice1Pic.setImage(dicePics.get(dice1 - 1));
        dice2Pic.setImage(dicePics.get(dice2 - 1));

        System.out.println(dice1);
        System.out.println(dice2);
    }
}
