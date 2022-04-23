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
import java.util.Scanner;

public class UserAccessControl {
    public void userAccess() {
        Register user1 = new Register();
        Login log = new Login();
        
        int selector;
        System.out.println("Welcome to BlackJack Game!!\n");
        System.out.println("To Login enter 1 \nTo Register enter 2");
        Scanner scan = new Scanner(System.in);
        selector = scan.nextInt();
        if (selector == 2) {
            System.out.println("========================================");
            System.out.println("Welcome to Registration Page");
            System.out.println("========================================\n");
            user1.registerUser();
        
        } else if (selector == 1) {
            System.out.println("========================================");
            System.out.println("Welcome to Login Page");
            System.out.println("========================================\n");
            log.userLogin();
        } else {
            System.out.println("You didn't enter valid choice ");

        }
        scan.close();
        // user1.registerUser();

        // userCheck.setName(log.getEnteredUser());
        // userCheck.setPassword(log.getEnteredPassword());
    }
}
