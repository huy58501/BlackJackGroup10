/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package blackjackgroup10;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author chuong5850
 */
public class UserMoneyTotalTest {
    
    /**
     * Test of userMoney method, of class UserMoneyBet.
     */
    @Test
    public void testUserMoneyGood() {
        System.out.println("userMoneyTotalCheck");
        UserMoneyTotal totalMoney = new UserMoneyTotal();
          int money = 100;
          boolean expResult = true;
          boolean result = totalMoney.moneyCheck(money);
          assertEquals(expResult,result );
    }
    
    @Test
    public void testUserMoneyBad() {
        System.out.println("userMoneyTotalCheck");
        UserMoneyTotal totalMoney = new UserMoneyTotal();
          int money = -10;
          boolean expResult = false;
          boolean result = totalMoney.moneyCheck(money);
          assertEquals(expResult,result );
    }
    
        @Test
    public void testUserMoneyBoundary() {
        System.out.println("userMoneyTotalCheck");
        UserMoneyTotal totalMoney = new UserMoneyTotal();
          int money = 1;
          boolean expResult = true;
          boolean result = totalMoney.moneyCheck(money);
          assertEquals(expResult,result );
    }
}
