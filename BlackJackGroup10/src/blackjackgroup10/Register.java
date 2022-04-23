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
   
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   


    public void registerUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your User Name: ");
        this.userName = input.nextLine();
        System.out.print("Enter your Password: ");
        this.password = input.nextLine();
      

        
        System.out.println(userName + " You are successfully registered");
      
        User userch = new User();
        userch.setUserName(userName);
        userch.setPassword(password);
        input.close();
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