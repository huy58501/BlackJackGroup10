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
    public static String userName;
    public static String password;
    
    /**
     * a constructor that takes in the user's name and password 
     */
    
    public User()
    {
    }

    public User(String userName, String password) {
       this.userName = userName;
       this.password=password;
    }

    /** The getter for the user name
     * @return the name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * The setter for the user name
     * @param givenName the name to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * The getter for the password
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * A setter for the password
     * @param givenPass 
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
}
