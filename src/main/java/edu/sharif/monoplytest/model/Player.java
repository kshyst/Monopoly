package edu.sharif.monoplytest.model;

import edu.sharif.monoplytest.GameState;
import edu.sharif.monoplytest.model.Tiles.Tile;
import javafx.scene.Node;

import java.util.ArrayList;

public class Player {
    public int playerId;
    public Node playerNode;
    private String playersEthnicity;
    private String playersAvatar;
    private ArrayList<Tile> ownedTiles = new ArrayList<Tile>();
    private int position;
    private int balance;
    private double xPos;
    private double yPos;

    public Player(Node playerNode, String playersEthnicity, String playersAvatar, ArrayList<Tile> ownedTiles, int position, int balance, double xPos, double yPos) {
        this.playerNode = playerNode;
        this.playersEthnicity = playersEthnicity;
        this.playersAvatar = playersAvatar;
        this.ownedTiles = ownedTiles;
        this.position = position;
        this.balance = balance;
        this.xPos = xPos;
        this.yPos = yPos;
        GameState.playersList.add(this);
    }

    public Player(int playerId) {
        this.playerId = playerId;
        this.position = 0;
        GameState.playersList.add(this);
    }
    /////////////////////getters and setters///////////////////////////
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
