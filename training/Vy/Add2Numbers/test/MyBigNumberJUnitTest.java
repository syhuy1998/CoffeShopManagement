/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import add2numbers.MyBigNumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
  @author T.T.Vy
 * this classes use for testing function MyBigNumber
 */
public class MyBigNumberJUnitTest {
    
    public MyBigNumberJUnitTest() {
    }
    
     @Test//test with 2 normal numbers
     public void test_1() 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("123", "321");
         String expResult = "444";
         assertEquals("pass",expResult,testString);
     }
     
     @Test//test with 1 number is 0
     public void test_2() 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("0", "321");
         String expResult = "321";
         assertEquals("pass",expResult,testString);
     }
     
     @Test//test with 2 numbers is 0
     public void test_3() 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("0", "0");
         String expResult = "0";
         assertEquals("pass",expResult,testString);
     }
     
     @Test//test with 2 different lenght of numbers
     public void test_4() 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("555", "6665");
         String expResult = "7220";
         assertEquals("pass",expResult,testString);
     }
}
