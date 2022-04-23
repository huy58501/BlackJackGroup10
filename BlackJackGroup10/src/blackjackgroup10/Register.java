/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgroup10;

import java.util.HashMap;
import java.util.Scanner;
/**
 *
 */
public class Register {
   
    public void registerUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your User Name: ");
        String userName = input.nextLine();
        System.out.print("Enter your Password: ");
        String password = input.nextLine();
      

        
        System.out.println(userName + " You are successfully registered");
      
        User userch = new User(userName,password);
        Login.userLogin();
        // UserCheck.passCheck();
    }
    
     public static boolean checkLength(String pass) {
		if (pass.length() >= 8) {
			return true;
		} else {
			return false;
		}
	}
    
    public static boolean checkSpecial (String pass) {
    boolean isSpecial = false;
		for (int i = 0; i < pass.length(); i++) {
			if (!Character.isLetterOrDigit(pass.charAt(i))) {
				isSpecial = true;
			} 
                         
		}
        return isSpecial;
    }
    public static boolean checkUpper (String pass) {
    boolean upper = false;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				upper=true;
			}

		}
		
		return upper;
	}
    
}