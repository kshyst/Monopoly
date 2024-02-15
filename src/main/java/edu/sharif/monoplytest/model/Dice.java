package edu.sharif.monoplytest.model;
import java.util.Random;
public class Dice {
    public static int getDice(){
        Random random = new Random();
        return  random.nextInt(6) + 1;
    }
}
