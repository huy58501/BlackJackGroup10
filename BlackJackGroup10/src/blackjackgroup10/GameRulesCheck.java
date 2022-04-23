package blackjackgroup10;
/**
 *
 * @author HoangChuongNguyen (Student ID: 991651113)
 * 
 * GamePlay rules: 
 * Including 2 player (Host and user), for the first round, player and host will have 2 cards, 
 * First round, random 2 cards for both user/player and host. The Host will show the User 1 of his 2 cards. 
 * There will be an option for the Player to continue drawing the next card or not.
 * In the second round, if the host has a total of less than 15 points on the card, the host is required to draw a third card, 
 * and for the user, it is 16 points. In case the 3rd card is drawn and the player's total score is more than 21 points, 
 * the player loses. At this point, there will be an option for the user to continue to draw cards or not 
 * if the total score is less than 21 points.
 * If the user chooses not to draw any more cards, the host and the user will open the cards, 
 * if anyone has a total of less than 21, more than 16 and greater than the other person, they will win.
 */
import java.util.*;

public class GameRulesCheck{
        int i=0;
        String input = null;
        UserBet game = new UserBet();
        
        public void gameRulesCheck(){
            Scanner sc1 = new Scanner(System.in);
            do {
                if (game.userTotal < 16){
                    System.out.println("Your point is less than 16, You have to draw a card or you will lose ");
                }
                System.out.println("Do you want to draw a card ? (y/n)");
                input  = sc1.nextLine();
                Card[] draw = CardHandGenerator.generatorHand(2);
                if (game.hostTotal < 15){
                    for (int j=0;game.hostTotal<16;j++){
                        game.hostTotal += draw[i].getValue().getCardValue();
                    }
                }
                // if user choose continue to draw a card
                if (yORn(input)){
                    game.userTotal += draw[i].getValue().getCardValue();
                    System.out.println("Here is your drawed card: "+draw[i].getValue()+ " "+ draw[i].getSuit());
                    System.out.println("Your point is: "+game.userTotal);
                    if (game.userTotal > 21){
                        break;
                    }
                }
                else
                    break;
            } while (input.equals("y"));
            
            resultDisplay();
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
            if (yORn(input))
                game.userBet();  
            else
                System.out.println("Game End!!");
            }
        }
        
        // win = true, lose = false
        public boolean ruleCheck(int userTotal, int hostTotal){
            if (userTotal <= 21 && hostTotal > 21)
                return true;
            else if (hostTotal < userTotal && userTotal <= 21)
                return true;
            return false;
        }
        
        // display result
        private void resultDisplay(){
            if (ruleCheck(game.userTotal, game.hostTotal)) {
                game.userMoney += game.userBet;
                System.out.println("Host point is: "+game.hostTotal);
                System.out.println("You Win!!!"+" Your total money is: " + game.userMoney);
            }
            else if (game.userTotal == game.hostTotal){
                System.out.println("Host point is: "+game.hostTotal);
                System.out.println("You and host are same point!!!"+" Your total money is: " + game.userMoney);
            }
            else {
                game.userMoney -= game.userBet;
                System.out.println("Host point is: "+game.hostTotal);
                System.out.println("You Lose!!!"+" Your total money is: " + game.userMoney);
            }
        }
        
        private boolean yORn(String input){
            return input.equals("y");
        }
        
}
