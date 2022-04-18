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
public class UserMoneyBetTest {
    
    @Test
    public void testUserMoneyGood() {
        System.out.println("userMoney");
        UserMoneyBet instance = new UserMoneyBet();
        int expResult = 1;
        int result = instance.userMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    public void testUserMoneyBad() {
        System.out.println("userMoney");
        UserMoneyBet instance = new UserMoneyBet();
        int expResult = 0;
        int result = instance.userMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    public void testUserMoneyBoundary() {
        System.out.println("userMoney");
        UserMoneyBet instance = new UserMoneyBet();
        int expResult = 0;
        int result = instance.userMoney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
