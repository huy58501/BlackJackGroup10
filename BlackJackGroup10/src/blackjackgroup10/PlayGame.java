/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgroup10;

import java.util.Scanner;
/**
 *
 * @author HoangChuongNguyen (Student ID: 991651113)
 * 
 * GamePlay rules: 
 * Including 2 player (Host and user), for the frist round, player and host will have 2 cards, 
 * First round, random 2 cards for both user/player and host. The Host will show the User 1 of his 2 cards. 
 * There will be an option for the Player to continue drawing the next card or not.
 * In the second round, if the host has a total of less than 15 points on the card, the host is required to draw a third card, 
 * and for the user, it is 16 points. In case the 3rd card is drawn and the player's total score is more than 21 points, 
 * the player loses. At this point, there will be an option for the user to continue to draw cards or not 
 * if the total score is less than 21 points.
 * If the user chooses not to draw any more cards, the host and the user will open the cards, 
 * if anyone has a total of less than 21, more than 16 and greater than the other person, they will win.
 */
public class PlayGame {
    /**
     * @param args the command line arguments
     */
    public static int hostTotal = 0;
    public static int userTotal = 0;
    public static String input = null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Register User1 = new Register();
        //User1.registerUser();
        //User1.userLogin();
        PlayGame.GamePlay();
    }
    
    public static void GamePlay(){
        Scanner sc = new Scanner(System.in);
        
        Card[] host = CardHandGenerator.generatorHand(2);
        Card[] player = CardHandGenerator.generatorHand(2);
        //print them for debugging
        System.out.println("Here is one of two host's card");
            for (int i=1;i<host.length;i++){
                System.out.println(host[i].getValue()+ " "+ host[i].getSuit());
                hostTotal += host[i].getValue().getCardValue();           
            }
            
        System.out.println("Here are your cards");   
            
        for (int i=0;i<player.length;i++){
            System.out.println(player[i].getValue() + " "+ player[i].getSuit());
            userTotal += player[i].getValue().getCardValue();
        }
        System.out.println("Your total is: "+userTotal);
        int i=0;
        do{
            Card[] draw = CardHandGenerator.generatorHand(10);
            System.out.println("Do you want to draw a card ? (y/n)");
            input  = sc.nextLine();
            if (hostTotal <= 15){
                    hostTotal += draw[i+1].getValue().getCardValue();
            }
            
            if (input.equals("y")){
                userTotal += draw[i].getValue().getCardValue();
                System.out.println("Here is your drawed card: "+draw[i].getValue()+ " "+ draw[i].getSuit());
                System.out.println("Your point is: "+userTotal);
                if (userTotal > 21 && hostTotal < 21 && hostTotal >= 15){
                    System.out.println("Host point is: "+hostTotal);
                    System.out.println("You loose!!!!");
                    break;
                }
                else if (hostTotal <= 15){
                    hostTotal += draw[i].getValue().getCardValue();
                }
                
                System.out.println("Host point is: "+hostTotal);
            }
            else if (input.equals("n")){
                for (int j=0;hostTotal<=21;j++){
                        hostTotal += draw[i].getValue().getCardValue();
                }
                
                if (hostTotal < userTotal && userTotal <= 21 || userTotal <= 21 && hostTotal > 21){
                    System.out.println("Congratulation, you are the Winner !!!!!!");
                }
                else if (hostTotal == userTotal){
                    System.out.println("Not bad, you and host are same point !!!!!!");
                }
                else {
                    System.out.println("Hahaha, you are a looser !!!!");
                }
                
                System.out.println("Host point is: "+hostTotal);
            }
            else {
                System.out.println("Error, answear should be y or n");
                continue;
            }
        }while(input.equals("y"));
  }
}
