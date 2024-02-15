package edu.sharif.monoplytest.model;

import java.util.HashMap;
import java.util.Random;

public class ChanceCard {
    private HashMap<Integer , String> chanceCards = new HashMap<Integer , String>(){
            {
                put(1 , "Advance to Go (Collect $200)");
                put(2 , "Advance to Illinois Ave");
                put(3 , "Advance to St. Charles Place");
                put(4 , "Advance token to nearest Utility");
                put(5 , "Advance token to the nearest Railroad");
                put(6 , "Bank pays you dividend of $50");
                put(7 , "Get out of Jail Free");
                put(8 , "Go Back 3 Spaces");
                put(9 , "Go to Jail");
                put(10 , "Make general repairs on all your property");
                put(11 , "Pay poor tax of $15");
                put(12 , "Take a trip to Reading Railroad");
                put(13 , "Take a walk on the Boardwalk");
                put(14 , "You have been elected chairman of the board");
                put(15 , "Your building loan matures");
                put(16 , "You have won a crossword competition");

        }
    };

    public int getRandomChanceCard(){
        Random random = new Random();
        return random.nextInt(chanceCards.size())+1;
    }

}
