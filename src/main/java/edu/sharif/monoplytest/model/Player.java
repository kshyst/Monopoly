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

    public Player(int playerId , int balance , Node playerNode) {
        this.playerId = playerId;
        this.balance = balance;
        this.position = 0;
        this.playerNode = playerNode;
        GameState.playersList.add(this);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public ArrayList<Tile> getOwnedTiles() {
        return ownedTiles;
    }

    public void setOwnedTiles(ArrayList<Tile> ownedTiles) {
        this.ownedTiles = ownedTiles;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public Node getPlayerNode() {
        return playerNode;
    }

    public void setPlayerNode(Node playerNode) {
        this.playerNode = playerNode;
    }

    public boolean arePlayersEqual(int playerId){
        return this.playerId == playerId;
    }
}
