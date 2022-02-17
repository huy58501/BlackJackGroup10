/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgroup10;

import java.util.Scanner;

/**
 *
 * @author chuong5850
 */
public class Register {
    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        this.email = input.nextLine();
        System.out.print("Enter your Age: ");
        this.age = input.nextInt();

        System.out.println(name + " you are registered ");

        input.close();
    }
    
}
