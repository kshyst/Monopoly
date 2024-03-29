package edu.sharif.monoplytest;

import edu.sharif.monoplytest.model.Ethnicity;
import edu.sharif.monoplytest.model.Player;
import edu.sharif.monoplytest.view.StageSettings;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main extends Application {
    public static Scene scene;
    public static Pane root;
    public Parent CreateContent(Stage stage) throws IOException{

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                onUpdate(stage);
            }
        };

        timer.start();

        Pane fxmlLoader = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("GameBoard.fxml")));
        root = fxmlLoader;
        return root;
    }

    private void onUpdate(Stage stage){

    }
    @Override
    public void start(Stage stage) throws IOException {
        scene  = new Scene(CreateContent(stage));
        StageSettings.CreateStage(stage , scene);

        //create players
        Player player1 = new Player(1 , 1000, new Circle(5,5,10,Color.rgb(255,255,25)));
        Player player2 = new Player(2 , 1000, new Circle(5,5,10,Color.rgb(102 , 0 , 51)));
        Player player3 = new Player(3 , 1000, new Circle(5,5,10,Color.rgb(0,152,51)));
        Player player4 = new Player(4 , 1000, new Circle(5,5,10,Color.rgb(51,51,255)));

        root.getChildren().add(player1.getPlayerNode());
        root.getChildren().add(player2.getPlayerNode());
        root.getChildren().add(player3.getPlayerNode());
        root.getChildren().add(player4.getPlayerNode());

        GameState.currentTurn = player1;
        GameState.playersList.set(0 , player1);
        GameState.playersList.set(1 , player2);
        GameState.playersList.set(2 , player3);
        GameState.playersList.set(3 , player4);

    }
    public static void main(String[] args) {
        launch(args);
    }
}