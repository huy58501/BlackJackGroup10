/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgroup10;

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
        instance.input = "n";
        boolean expResult = true;
        instance.gameRulesCheck();
    }
    
}
