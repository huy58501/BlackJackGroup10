/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgroup10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author joshs
 */
public class GameRulesCheckTest {
    
    @Test
    public void testGameRulesCheckGood() {
        System.out.println("gameRulesCheck");
        GameRulesCheck instance = new GameRulesCheck();
        boolean result = instance.ruleCheck(18,25);
        boolean expResult = true;
        assertEquals(result,expResult);
    }
    
    @Test
    public void testGameRulesCheckBad() {
        System.out.println("gameRulesCheck");
        GameRulesCheck instance = new GameRulesCheck();
        boolean result = instance.ruleCheck(17,21);
        boolean expResult = false;
        assertEquals(result,expResult);
    }
    
    @Test
    public void testGameRulesCheckBoundary() {
        System.out.println("gameRulesCheck");
        GameRulesCheck instance = new GameRulesCheck();
        boolean result = instance.ruleCheck(21,21);
        boolean expResult = false;
        assertEquals(result,expResult);
    }
}
