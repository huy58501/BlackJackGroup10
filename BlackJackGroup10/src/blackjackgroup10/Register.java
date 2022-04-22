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
    private String name;
    private String userName;
    private String password;
    private int age;
  
    
HashMap<String, String> userLogin = new HashMap<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return "user";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return "12345678";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void registerUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        this.name = input.nextLine();
        System.out.print("Enter your Email: ");
        this.userName = input.nextLine();
        System.out.print("Enter your Age: ");
        this.age = input.nextInt();

        System.out.println(name + " you are registered \n");
        
        userLogin.put(this.userName, this.password);
        System.out.println(" User Name: " + userName + "\n Password: " + userLogin.get(userName));
        userLogin.put(this.name, this.password);
        
        input.close();
        // UserCheck.passCheck();
    }
    
     public HashMap getUserInfo() {
        // userLogin.put("user", "123456");
        return userLogin;
    }
    public void userLogin(){
       // UserCheck.passCheck();
       // UserCheck.userCheck();
    }
}
