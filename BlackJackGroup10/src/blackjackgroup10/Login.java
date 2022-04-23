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
    private String enteredUser;
    private String enteredPassword;
    

    public String getEnteredUser() {
        return enteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        this.enteredUser = enteredUser;
    }

    public String getEnteredPassword() {
        return enteredPassword;
    }

    public void setEnteredPassword(String enteredPassword) {
        this.enteredPassword = enteredPassword;
    }
   
    
    
    public void userLogin(){
       
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter your user name: ");
    String enteredUser = scan.nextLine();
    System.out.println("Enter your password: ");
    String enteredPassword = scan.nextLine();
    
    //User login = new User(enteredUser, enteredPassword);
    
    UserCheck login = new UserCheck();
    if(login.passCheck().equals(enteredPassword) && login.userCheck().equals(enteredUser)){
        System.out.println("You're logged in successfully " );        
    }   
    else {
        System.out.println("Icorect user name or password" );
    }
    
  }
     
}
