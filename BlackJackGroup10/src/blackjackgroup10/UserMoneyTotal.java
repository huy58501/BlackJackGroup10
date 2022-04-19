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
public class UserMoneyTotal {
    Scanner sc = new Scanner(System.in);
    
    // asking user total money
    public void userMoney(){
        System.out.println("How much money you have? ");
        UserBet moneyBet = new UserBet();
        moneyBet.userMoney = sc.nextInt();
        // checking if money > 0
        if (moneyCheck(moneyBet.userMoney)){
            moneyBet.userBet();
        }
        else{
            System.out.println("Your total money can not less than 0");
            userMoney();
        }
    }
    
    public boolean moneyCheck(int moneyTotal){
        if (moneyTotal <= 0){
            return false;
        }
        return true;
    }
}
