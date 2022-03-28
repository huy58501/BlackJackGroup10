package blackjackgroup10;
/*
 * @author HoangChuongNguyen (Student ID: 991651113)
 */
import java.util.*;
import java.io.*;

class Game{
    static int userMoney = 0;
    static int userBet = 0;
    static int hostTotal = 0;
    static int userTotal = 0;
    Scanner sc = new Scanner(System.in);
    // asking user for bet and check condition
    public int userBet (){
        System.out.println("How much money you bet for this round? ");
        userBet = sc.nextInt();
        if (userBet <= userMoney && userBet > 0){
            gamePlay();
        }
        else{
            System.out.println("Error, your bet can not greater than your total money or less than 0");
            userBet();
        }
        return userBet;
    }
    // asking user total money
    public int userMoney(){
        System.out.println("How much money you have? ");
        userMoney = sc.nextInt();
        // checking if money > 0
        if (userMoney <= 0){
            System.out.println("Your total money can not less than 0");
            userMoney();
        }
        else {
            userBet();
        }
        return userMoney;
    }
    
    public void gamePlay(){
        GameRulesCheck rules = new GameRulesCheck();
        Card[] host = CardHandGenerator.generatorHand(2);
        Card[] player = CardHandGenerator.generatorHand(2);
        //print them for debugging
        System.out.println("Here is one of two host's card");
            for (int i=1;i<host.length;i++){
                System.out.println(host[i].getValue()+ " "+ host[i].getSuit());
                hostTotal += host[i].getValue().getCardValue();           
            }
            
        System.out.println("\nHere are your cards");   
            
        for (Card user : player) {
            System.out.println(user.getValue() + " " + user.getSuit());
            userTotal += user.getValue().getCardValue();
        }
        System.out.println("Your total is: "+userTotal);
        
        // check rules
        rules.gameRulesCheck();
    }
}

public class GameRulesCheck{
    int i=0;
    String input = null;
    
    public void gameRulesCheck(){
        Scanner sc1 = new Scanner(System.in);
        Game game = new Game();
        
        OUTER:
        do {
            if (game.userTotal <16){
                System.out.println("Your point is less than 16, You have to draw a card or you will lose ");
            }
            System.out.println("Do you want to draw a card ? (y/n)");
            input  = sc1.nextLine();
            Card[] draw = CardHandGenerator.generatorHand(2);
            if (game.hostTotal <= 15){
                for (int j=0;game.hostTotal<16;j++){
                    game.hostTotal += draw[i].getValue().getCardValue();
                }
            }
            // if user choose continue play game
            switch (input) {
                case "y" -> {
                    // user draw a card
                    game.userTotal += draw[i].getValue().getCardValue();
                    
                    System.out.println("Here is your drawed card: "+draw[i].getValue()+ " "+ draw[i].getSuit());
                    System.out.println("Your point is: "+game.userTotal);
                    // rules condition
                    if (game.userTotal > 21 && game.hostTotal <=21) {
                        game.userMoney -= game.userBet;
                        System.out.println("Host point is: "+game.hostTotal);
                        System.out.println("You bust, host win"+" Your total money is: " + game.userMoney);
                        break OUTER;
                    } else if (game.userTotal > 21 && game.hostTotal > 21) {
                        System.out.println("Host point is: "+game.hostTotal);
                        System.out.println("You and host are bust, play again!!!"+" Your total money is: " + game.userMoney);
                        break OUTER;
                    }
                }
                case "n" -> {
                    // if user lower than 16 and stop play.
                    if (game.userTotal < 16) {
                        game.userMoney -= game.userBet;
                        System.out.println("You are lose"+" Your total money is: " + game.userMoney);
                        break OUTER;
                    } else if (game.hostTotal < game.userTotal && game.userTotal <= 21 || game.userTotal <= 21 && game.hostTotal > 21){
                        game.userMoney += game.userBet;
                        System.out.println("Host point is: "+game.hostTotal);
                        System.out.println("Congratulation, you are the Winner !!!!!!"+" Your total money is: " + game.userMoney);
                        
                    }
                    else if (game.hostTotal == game.userTotal && game.userTotal > 21){
                        System.out.println("Not bad, you and host are busts !!!!!!"+" Your total money is: " + game.userMoney);
                        System.out.println("Host point is: "+game.hostTotal);
                    }
                    else if (game.hostTotal == game.userTotal && game.userTotal <= 21){
                        System.out.println("Host point is: "+game.hostTotal);
                        System.out.println("Not bad, you and host are same point !!!!!!"+" Your total money is: " +game.userMoney);
                    }
                    else {
                        game.userMoney -= game.userBet;
                        System.out.println("Host point is: "+game.hostTotal);
                        System.out.println("Hahaha, you are a looser !!!!" + " Your total money is: " +game.userMoney);
                    }   break OUTER;
                }
                default -> System.out.println("Error, answear should be y or n");
            }
        } while (input.equals("y"));
        
        // reset user and host points
        game.userTotal = 0;
        game.hostTotal = 0;
        if (game.userMoney <= 0){
                System.out.println("You dont have enough money to play, Game End!!!");
        }
        else {
        // ask to continue play game
        System.out.println("Do you want to play another game (y/n)");
        input  = sc1.nextLine();
        if (input.equals("y"))
            game.userBet();  
        else
            System.out.println("Game End!!");
        }
    }
}
