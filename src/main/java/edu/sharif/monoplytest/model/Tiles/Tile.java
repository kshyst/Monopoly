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

    public Tile(int tilePosition, String tileType) {
        this.tilePosition = tilePosition;
        this.tileType = tileType;
    }

    public String getTileType() {
        return tileType;
    }

    public void setTileType(String tileType) {
        this.tileType = tileType;
    }

    public int getTilePosition() {
        return tilePosition;
    }

    public void setTilePosition(int tilePosition) {
        this.tilePosition = tilePosition;
    }

}
