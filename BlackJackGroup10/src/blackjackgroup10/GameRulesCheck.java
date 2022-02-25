/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgroup10;

import static blackjackgroup10.PlayGame.hostTotal;
import static blackjackgroup10.PlayGame.input;
import static blackjackgroup10.PlayGame.userTotal;
import java.util.Scanner;

/**
 *
 * @author chuong5850
 */
public class GameRulesCheck {
    public static void gameRulesCheck(){
        int i=0;
        
        do{
            if (userTotal <16){
                System.out.println("Your point is less than 16, You have to draw a card or you will lose ");
            }
            // ask user to draw card.
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to draw a card ? (y/n)");
            input  = sc.nextLine();
            
            // draw two cards
            Card[] draw = CardHandGenerator.generatorHand(2);
            if (hostTotal <= 15){
                for (int j=0;hostTotal<16;j++){
                            hostTotal += draw[i].getValue().getCardValue();
                }
            }
            
            if (input.equals("y")){
                
                userTotal += draw[i].getValue().getCardValue();
                System.out.println("Here is your drawed card: "+draw[i].getValue()+ " "+ draw[i].getSuit());
                System.out.println("Your point is: "+userTotal);
                
                if (userTotal > 21 && hostTotal <=21){
                    System.out.println("You bust");
                    System.out.println("Host point is: "+hostTotal);
                    break;
                }
                else if (userTotal > 21 && hostTotal > 21){
                    System.out.println("You and host are bust, play again!!!");
                    System.out.println("Host point is: "+hostTotal);
                    break;
                }
            }
            
            else if (input.equals("n")){
                // if user lower than 16 and stop play.
                if (userTotal < 16){
                    System.out.println("You are lose");
                    break;
                }
                // if host < user and user <= 21 or user <=21 and host >21, you win
                else if (hostTotal < userTotal && userTotal <= 21 || userTotal <= 21 && hostTotal > 21){
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
                }
                
                
            }
            
            else {
                System.out.println("Error, answear should be y or n");
                continue;
            }
        }while(input.equals("y"));
    }
}
