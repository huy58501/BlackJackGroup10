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
    
    public static void userLogin(){
        UserMoneyTotal game1 = new UserMoneyTotal();   
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your user name: ");
        String enteredUser = scan.nextLine();
        System.out.println("Enter your password: ");
        String enteredPassword = scan.nextLine();

        //User login = new User(enteredUser, enteredPassword);

        if(enteredUser.equals(User.userName) && enteredPassword.equals(User.password)){
            System.out.println("You're logged in successfully " );   
            game1.userMoney();
        }   
        else {
            System.out.println("Icorect user name or password" );
        }

    }
     
}
