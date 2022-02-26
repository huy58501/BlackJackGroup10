package blackjackgroup10;
/*
 * @author HoangChuongNguyen (Student ID: 991651113)
 */
import static blackjackgroup10.PlayGame.hostTotal;
import static blackjackgroup10.PlayGame.input;
import static blackjackgroup10.PlayGame.userTotal;
import java.util.Scanner;

public class GameRulesCheck {
    
    public static void gameRulesCheck(){
        int i=0;
        Scanner sc = new Scanner(System.in);
        OUTER:
        do {
            if (userTotal <16){
                System.out.println("Your point is less than 16, You have to draw a card or you will lose ");
            }
            System.out.println("Do you want to draw a card ? (y/n)");
            input  = sc.nextLine();
            Card[] draw = CardHandGenerator.generatorHand(2);
            if (hostTotal <= 15){
                for (int j=0;hostTotal<16;j++){
                    hostTotal += draw[i].getValue().getCardValue();
                }
            }
            // if user choose continue play game
            switch (input) {
                case "y" -> {
                    // user draw a card
                    userTotal += draw[i].getValue().getCardValue();
                    System.out.println("Here is your drawed card: "+draw[i].getValue()+ " "+ draw[i].getSuit());
                    System.out.println("Your point is: "+userTotal);
                    // rules condition
                    if (userTotal > 21 && hostTotal <=21) {
                        System.out.println("You bust, host win");
                        System.out.println("Host point is: "+hostTotal);
                        break OUTER;
                    } else if (userTotal > 21 && hostTotal > 21) {
                        System.out.println("You and host are bust, play again!!!");
                        System.out.println("Host point is: "+hostTotal);
                        break OUTER;
                    }
                }
                case "n" -> {
                    // if user lower than 16 and stop play.
                    if (userTotal < 16) {
                        System.out.println("You are lose");
                        break OUTER;
                    } else if (hostTotal < userTotal && userTotal <= 21 || userTotal <= 21 && hostTotal > 21){
                        System.out.println("Congratulation, you are the Winner !!!!!!");
                        System.out.println("Host point is: "+hostTotal);
                    }
                    else if (hostTotal == userTotal && userTotal > 21){
                        System.out.println("Not bad, you and host are busts !!!!!!");
                        System.out.println("Host point is: "+hostTotal);
                    }
                    else if (hostTotal == userTotal && userTotal <= 21){
                        System.out.println("Not bad, you and host are same point !!!!!!");
                        System.out.println("Host point is: "+hostTotal);
                    }
                    else {
                        System.out.println("Hahaha, you are a looser !!!!");
                        System.out.println("Host point is: "+hostTotal);
                    }   break OUTER;
                }
                default -> System.out.println("Error, answear should be y or n");
            }
        } while (input.equals("y"));
        
        // reset user and host points
        userTotal = 0;
        hostTotal = 0;
        // ask to continue play game
        System.out.println("Do you want to play another game (y/n)");
        input  = sc.nextLine();
        if (input.equals("y"))
            PlayGame.gamePlay();
        else
            System.out.println("Game End!!");
    }
}
