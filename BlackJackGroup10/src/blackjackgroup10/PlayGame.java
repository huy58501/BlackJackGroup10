package blackjackgroup10;
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        Game game1 = new Game();
        Register User1 = new Register();
        //User1.registerUser();
        //User1.userLogin();
        game1.userMoney();
    }
}
