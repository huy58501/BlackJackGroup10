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
public class UserMoneyCheck {
    static int userMoney = 0;
    static int userBet = 0;
    static int hostTotal = 0;
    static int userTotal = 0;
    Scanner sc = new Scanner(System.in);
    // asking user for bet and check condition
    public int userBet (){
        PlayGame gamePlay = new PlayGame();
        System.out.println("How much money you bet for this round? ");
        userBet = sc.nextInt();
        if (userBet <= userMoney && userBet > 0){
            gamePlay.gamePlay();
        }
        else{
            System.out.println("Error, your bet can not greater than your total money or less than 0");
            userBet();
        }
        return userBet;
    }
}
