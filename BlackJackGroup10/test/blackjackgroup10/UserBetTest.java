/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgroup10;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joshs
 */
public class UserBetTest {
    
    @Test
    public void testUserBetCheckGood() {
        System.out.println("userBetCheck");
        UserBet instance = new UserBet();
        instance.userMoney = 1000;
        int userMoneyBet = 10;
        boolean expResult = true;
        boolean result = instance.userBetCheck(userMoneyBet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testUserBetCheckBad() {
        System.out.println("userBetCheck");
        int userMoneyBet = -1;
        UserBet instance = new UserBet();
        boolean expResult = false;
        boolean result = instance.userBetCheck(userMoneyBet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testUserBetCheckBoundary() {
        System.out.println("userBetCheck");
        int userMoneyBet = 1;
        UserBet instance = new UserBet();
        boolean expResult = true;
        boolean result = instance.userBetCheck(userMoneyBet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
