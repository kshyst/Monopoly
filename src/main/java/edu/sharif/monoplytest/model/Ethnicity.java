package edu.sharif.monoplytest.model;

import edu.sharif.monoplytest.GameState;

import java.util.ArrayList;
import java.util.stream.LongStream;

public class Ethnicity {
    private String ethnicityName;
    private double moneyManagement;
    private double greediness;
    private double humanRights;
    private double likeablity;
    public static ArrayList<String> ethnicityList = new ArrayList<String>();

    public Ethnicity(String ethnicityName, double moneyManagement, double greediness, double humanRights, double likeablity) {
        this.ethnicityName = ethnicityName;
        this.moneyManagement = moneyManagement;
        this.greediness = greediness;
        this.humanRights = humanRights;
        this.likeablity = likeablity;
        ethnicityList.add(ethnicityName);
        GameState.ethnicities.add(this);
    }

    public String getEthnicityName() {
        return ethnicityName;
    }

    public void setEthnicityName(String ethnicityName) {
        this.ethnicityName = ethnicityName;
    }

    public double getMoneyManagement() {
        return moneyManagement;
    }

    public void setMoneyManagement(double moneyManagement) {
        this.moneyManagement = moneyManagement;
    }

    public double getGreediness() {
        return greediness;
    }

    public void setGreediness(double greediness) {
        this.greediness = greediness;
    }

    public double getHumanRights() {
        return humanRights;
    }

    public void setHumanRights(double humanRights) {
        this.humanRights = humanRights;
    }

    public double getLikeablity() {
        return likeablity;
    }

    public void setLikeablity(double likeablity) {
        this.likeablity = likeablity;
    }

    public static Ethnicity findEthnicity(String e){
        for (Ethnicity eth : GameState.ethnicities){
            if (eth.ethnicityName.equals(e)){
                return eth;
            }
        }
        return null;
    }
}
