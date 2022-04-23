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
 * @author Sharif
 */
public class RegisterTest {
    
    public RegisterTest() {
    }

    /**
     * Test of getName method, of class Register.
     */
   

    /**
     * Test of checkLength method, of class Register.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLength");
        String pass = "123456789";
        boolean expResult = true;
        boolean result = Register.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLength");
        String pass = "1234567";
        boolean expResult = false;
        boolean result = Register.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testCheckLengthBoundry() {
        System.out.println("checkLength");
        String pass = "12345678";
        boolean expResult = true;
        boolean result = Register.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkSpecial method, of class Register.
     */
    @Test
    public void testCheckSpecialBoundry() {
        System.out.println("checkSpecial");
        String pass = "123456a@";
        boolean expResult = true;
        boolean result = Register.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
      @Test
    public void testCheckSpecialGood() {
        System.out.println("checkSpecial");
        String pass = "123456789!@";
        boolean expResult = true;
        boolean result = Register.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
      @Test
    public void testCheckSpecialBad() {
        System.out.println("checkSpecial");
        String pass = "123456a";
        boolean expResult = false;
        boolean result = Register.checkSpecial(pass);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of checkUpper method, of class Register.
     */
     @Test
    public void testCheckUpperBoundryGood() {
        System.out.println("checkUpper");
        String pass = "BlackJackGroup10";
        boolean expResult = true;
        boolean result = Register.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testCheckUpperBoundry() {
        System.out.println("checkUpper");
        String pass = "Blackjackgroup";
        boolean expResult = false;
        boolean result = Register.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testCheckUpperBad() {
        System.out.println("checkUpper");
        String pass = "blackjack";
        boolean expResult = false;
        boolean result = Register.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   
    
}
