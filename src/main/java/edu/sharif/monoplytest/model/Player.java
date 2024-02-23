package edu.sharif.monoplytest.model;

import edu.sharif.monoplytest.GameState;
import edu.sharif.monoplytest.model.Tiles.Tile;
import javafx.scene.Node;

import java.util.ArrayList;

public class Player {
    private boolean isInTheGame = false;
    private int jailTime = 0;
    public int playerId;
    private String playerUserName;
    public Node playerNode;
    private String playersEthnicity;
    private ArrayList<Tile> ownedTiles = new ArrayList<Tile>();
    private int position;
    private int balance;

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

    public boolean isInTheGame() {
        return isInTheGame;
    }

    public void setInTheGame(boolean inTheGame) {
        isInTheGame = inTheGame;
    }

    public int getJailTime() {
        return jailTime;
    }

    public void setJailTime(int jailTime) {
        this.jailTime = jailTime;
    }

    public String getPlayerUserName() {
        return playerUserName;
    }

    public void setPlayerUserName(String playerUserName) {
        this.playerUserName = playerUserName;
    }

    public String getPlayersEthnicity() {
        return playersEthnicity;
    }

    public void setPlayersEthnicity(String playersEthnicity) {
        this.playersEthnicity = playersEthnicity;
    }

    public boolean arePlayersEqual(int playerId){
        return this.playerId == playerId;
    }
}
