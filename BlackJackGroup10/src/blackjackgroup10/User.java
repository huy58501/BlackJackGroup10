/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgroup10;

/**
 *
 * @author chuong5850
 */
public class User {
     private String name;
    private String password;
    
    /**
     * a constructor that takes in the user's name and password
     * @param givenName
     * @param givenPass 
     */
    public User(String givenName, String givenPass)
    {
        name = givenName;
        password=givenPass;
    }
}
