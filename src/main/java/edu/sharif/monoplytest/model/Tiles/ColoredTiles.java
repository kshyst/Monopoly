package edu.sharif.monoplytest.model.Tiles;

import edu.sharif.monoplytest.model.Player;

public class ColoredTiles extends Tile {
    private Player owner;
    private String color;
    private String tileName;
    private int tilePrice;
    private int tileRent;
    private int tileHouseCount;
    private int tileHousePrice;

    public ColoredTiles(int position , Player owner, String color, String tileName, int tilePrice, int tileRent, int tileHouseCount, int tileHousePrice) {
        super(position , "ColoredTiles");
        this.owner = owner;
        this.color = color;
        this.tileName = tileName;
        this.tilePrice = tilePrice;
        this.tileRent = tileRent;
        this.tileHouseCount = tileHouseCount;
        this.tileHousePrice = tileHousePrice;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTileName() {
        return tileName;
    }

    public void setTileName(String tileName) {
        this.tileName = tileName;
    }

    public int getTilePrice() {
        return tilePrice;
    }

    public void setTilePrice(int tilePrice) {
        this.tilePrice = tilePrice;
    }

    public int getTileRent() {
        return tileRent;
    }

    public void setTileRent(int tileRent) {
        this.tileRent = tileRent;
    }

    public int getTileHouseCount() {
        return tileHouseCount;
    }

    public void setTileHouseCount(int tileHouseCount) {
        this.tileHouseCount = tileHouseCount;
    }

    public int getTileHousePrice() {
        return tileHousePrice;
    }

    public void setTileHousePrice(int tileHousePrice) {
        this.tileHousePrice = tileHousePrice;
    }

}
