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
public class UserMoneyBet {
    Scanner sc = new Scanner(System.in);
    // asking user total money
    public int userMoney(){
        UserMoneyCheck moneyBet = new UserMoneyCheck();
        System.out.println("How much money you have? ");
        moneyBet.userMoney = sc.nextInt();
        // checking if money > 0
        if (moneyBet.userMoney <= 0){
            System.out.println("Your total money can not less than 0");
            userMoney();
        }
        else {
            moneyBet.userBet();
        }
        return moneyBet.userMoney;
    }
}
