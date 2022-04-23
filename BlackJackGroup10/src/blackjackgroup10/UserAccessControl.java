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
        System.out.println("Enter 1 to Login --- 2 to Register");
        try (Scanner scan = new Scanner(System.in)) {
            selector = scan.nextInt();
            switch (selector) {
                case 2 -> {
                    System.out.println("========================================");
                    System.out.println("Welcome to Registration Page");
                    System.out.println("========================================\n");
                    user1.registerUser();
                }
                case 1 -> {
                    System.out.println("========================================");
                    System.out.println("Welcome to Login Page");
                    System.out.println("========================================\n");
                    System.out.println("username: admin , password: 12345678A@");
                    User u = new User("admin","12345678A@");
                    log.userLogin();
                }
                default -> System.out.println("You didn't enter valid choice ");
            }
            // user1.registerUser();
            // userCheck.setName(log.getEnteredUser());
            // userCheck.setPassword(log.getEnteredPassword());
        }
    }
}
