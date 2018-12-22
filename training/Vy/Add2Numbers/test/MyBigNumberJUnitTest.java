/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import addtwonumbers.MyBigNumber;
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
     public void test_1() throws Exception 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("123", "321");
         String expResult = "444";
         assertEquals("pass",expResult,testString);
     }
     
     @Test//test with 1 number is 0
     public void test_2() throws Exception 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("0", "321");
         String expResult = "321";
         assertEquals("pass",expResult,testString);
     }
     
     @Test//test with 2 numbers is 0
     public void test_3() throws Exception 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("0", "0");
         String expResult = "0";
         assertEquals("pass",expResult,testString);
     }
     
     @Test//test with 2 different lenght of numbers
     public void test_4() throws Exception 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("555", "6665");
         String expResult = "7220";
         assertEquals("pass",expResult,testString);
     }
     @Test(expected = Exception.class)//test with character
     public void test_5() throws Exception 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("n", "6665");
         Exception exception = new Exception("found unacceptable character in 2 strings");
         assertEquals("pass",exception,testString);
     }
     @Test(expected = Exception.class)//test with special character
     public void test_6() throws Exception 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("n", "{}");
         Exception exception = new Exception("found unacceptable character in 2 strings");
         assertEquals("pass",exception,testString);
     }
     @Test(expected = Exception.class)//test with special character
     public void test_7() throws Exception 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("1", "-1");
         Exception exception = new Exception("found unacceptable character in 2 strings");
         assertEquals("pass",exception,testString);
     }
     public void test_8() throws Exception 
     {
         int a = 0 ;
         int b = 0 ;
         int result = 0;
         MyBigNumber mybignumber = new MyBigNumber();
         
         for ( int i = 0 ; i < 1000000000 ; i++ )
         {
             a += 2;
             b += 3;
             result += 5;
         }
         
         String testString = mybignumber.sum(a + "", b + "");
         assertEquals("pass",result + "",testString);
     }
     
     @Test//test with null
     public void test_9() throws Exception 
     {
         MyBigNumber mybignumber = new MyBigNumber();
         String testString = mybignumber.sum("", "311");
         assertEquals("pass","311",testString);
     }
}
