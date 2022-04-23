/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgroup10;

/**
 *
 * @author Sharif
 */
import java.util.*;
public class Login {
    
    public void userLogin(){
        UserMoneyTotal game1 = new UserMoneyTotal();   
        Scanner scan = new Scanner (System.in);
        String enteredUser = null;
        String enteredPassword = null;
        //User login = new User(enteredUser, enteredPassword);
        do {
            System.out.println("================LOGIN================\n");
            System.out.println("Enter your user name: ");
            enteredUser = scan.nextLine();
            System.out.println("Enter your password: ");
            enteredPassword = scan.nextLine();
            
            if(enteredUser.equals(User.userName) && enteredPassword.equals(User.password)){
            System.out.println("You're logged in successfully " );   
            game1.userMoney();
            }   
            else {
                System.out.println("Icorect user name or password, please try again \n" );
            } 
        }while (!(enteredUser.equals(User.userName) && enteredPassword.equals(User.password)));
    }
     
}
