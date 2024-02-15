package edu.sharif.monoplytest.model.Tiles;

import edu.sharif.monoplytest.model.Player;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class Tile {
    private int tilePosition;
    private String tileType;
    public ArrayList<Circle> playersPos = new ArrayList<>();
    public Pane pane;

    private void x(){
        Circle circle = (Circle) pane.getChildren().get(1);
    }

}
