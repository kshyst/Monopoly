package edu.sharif.monoplytest.model;

import javafx.animation.TranslateTransition;
import javafx.geometry.Point2D;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.util.HashMap;
import java.util.Random;

import static edu.sharif.monoplytest.GameState.currentTurn;
import static edu.sharif.monoplytest.GameState.playersList;
import static edu.sharif.monoplytest.Main.scene;
import static edu.sharif.monoplytest.controller.circleList;

public class ChanceCard {
    private static HashMap<Integer , String> chanceCards = new HashMap<Integer , String>(){
            {
                put(1 , "go to herasat");
                put(2 , "get 100$ from bank");
                put(3 , "pay 50$ to every other players");
                put(4 , "go to self");
                put(5 , "pay 500$ to bank");
        }
    };

    public static int getRandomChanceCard(){
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public static void applyChanceCard(int chanceCardIndex , Label gameLog){
        switch (chanceCardIndex){
            case 1 :
                posChanger(14 ,currentTurn);
                gameLog.setText("you have been caught by herasat");
                currentTurn.setJailTime(1);
                break;
            case 2 :
                currentTurn.setBalance(currentTurn.getBalance() + 100);
                gameLog.setText("you earned 100$ from the bank");
                break;
            case 3 :
                for (Player p : playersList){
                    if (p.isInTheGame() && (p.playerId != currentTurn.playerId)){
                        p.setBalance(p.getBalance() + 50);
                        currentTurn.setBalance(currentTurn.getBalance() - 50);
                    }
                }
                gameLog.setText("you payed  50$ to every other player");
                break;
            case 4 :
                posChanger(7 , currentTurn);
                gameLog.setText("you went to self cuz you hungry af");
                currentTurn.setBalance(currentTurn.getBalance() - 5);
            case 5 :
                currentTurn.setBalance(currentTurn.getBalance() - 500);
                gameLog.setText("you payed 500$ to bank hehe");
                break;
            default:
                break;
        }
    }

    public static void posChanger(int pos , Player player){
        int currentPos = player.getPosition();
        player.setPosition(pos);
        final Point2D windowCoord = new Point2D(scene.getWindow().getX(), scene.getWindow().getY());
        final Point2D sceneCoord = new Point2D(scene.getX(), scene.getY());
        int prevPosition = currentPos;
        final Point2D nodeCoord1 = circleList.get(prevPosition + 28 * (player.playerId - 1)).localToScene(0.0, 0.0);
        final Point2D nodeCoord2 = circleList.get(player.getPosition() + 28 * (player.playerId - 1)).localToScene(0.0, 0.0);

        final double currentTileX = Math.round(windowCoord.getX() + sceneCoord.getX() + nodeCoord1.getX());
        final double currentTileY = Math.round(windowCoord.getY() + sceneCoord.getY() + nodeCoord1.getY());

        final double nextTileX = Math.round(windowCoord.getX() + sceneCoord.getX() + nodeCoord2.getX());
        final double nextTileY = Math.round(windowCoord.getY() + sceneCoord.getY() + nodeCoord2.getY());

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(playersList.get(player.playerId - 1).getPlayerNode());
        translateTransition.setDuration(Duration.seconds(1));
        translateTransition.setByX(nextTileX - currentTileX);
        translateTransition.setByY(nextTileY - currentTileY);
        translateTransition.play();
    }

}
