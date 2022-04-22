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
    public void testGameRulesCheck() {
        System.out.println("gameRulesCheck");
        GameRulesCheck instance = new GameRulesCheck();
        instance.input = "y";
        boolean result = instance.ruleCheck(20, 21);
        boolean expResult = true;
        instance.gameRulesCheck();
        assertEquals(result,expResult);
    }
    /*
    @Test
    public void testGameRulesCheck2() {
        System.out.println("gameRulesCheck");
        GameRulesCheck instance = new GameRulesCheck();
        instance.gameRulesCheck();
        boolean result = instance.ruleCheck(21,20);
        boolean expResult = true;
        assertEquals(result,expResult);
    }*/
    
}
