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

        int selector;
        System.out.println("Welcome to BlackJack Game!!\n");
        System.out.println("To Login enter 1\nTo Register enter 2");
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
            Login(user1);
        } else {
            System.out.println("You didn't enter valid choice ");

        }
        scan.close();
        // user1.registerUser();

        // userCheck.setName(log.getEnteredUser());
        // userCheck.setPassword(log.getEnteredPassword());
    }

    public static void Login(Register user1) {
        Login log = new Login(user1.getUserInfo());
        log.userLogin();

        /*
         * User userCheck = new User();
         * UserCheck usercheckObject = new UserCheck();
         * userCheck.setName(log.getEnteredUser());
         * userCheck.setPassword(log.getEnteredPassword());
         * usercheckObject.passCheck();
         * usercheckObject.userCheck();
         */

        if (user1.getUserName().equals(log.getEnteredUser()) && user1.getPassword().equals(log.getEnteredPassword())) {

            System.out.println("Susccessfully Loged in");
            // System.out.println("Welcom " +
            // user1.getUserInfo().get(log.getEnteredPassword()));

        } else {
            System.out.println("Wrong Login Info ");
        }
    }
}

