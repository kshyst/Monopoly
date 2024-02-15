package edu.sharif.monoplytest.model;

public class Tile {
    Player owner;
    private int tilePosition;
    private String tileType;
    private int tilePrice;
    private int tileRent;
    private int tileHouseCount;
    private int tileHotelCount;
    private int tileMortgage;
    private int tileMortgagePrice;
    private int tileHousePrice;
    private int tileHotelPrice;
    private int tileGroup;

    //colored tiles
    public Tile(int tilePosition, String tileType, int tilePrice, int tileRent, int tileHouseCount, int tileHotelCount, int tileMortgage, int tileMortgagePrice, int tileHousePrice, int tileHotelPrice, int tileGroup) {
        this.tilePosition = tilePosition;
        this.tileType = tileType;
        this.tilePrice = tilePrice;
        this.tileRent = tileRent;
        this.tileHouseCount = tileHouseCount;
        this.tileHotelCount = tileHotelCount;
        this.tileMortgage = tileMortgage;
        this.tileMortgagePrice = tileMortgagePrice;
        this.tileHousePrice = tileHousePrice;
        this.tileHotelPrice = tileHotelPrice;
        this.tileGroup = tileGroup;
    }
    //chance and community chest and go to jail and free parking and go and jail
    public Tile(int tilePosition, String tileType) {
    }
    //airport and utility
    public Tile(int tilePosition, String tileType, int tilePrice, int tileRent) {
    }

    public int getTileRent() {
        return 0;
    }
}
