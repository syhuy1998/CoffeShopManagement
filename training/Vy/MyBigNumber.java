/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add2numbers;

/**
 *
 * @author T.T.Vy
 * this classes use for adding 2 numbers
 */
public class MyBigNumber {
    
    /**
     * in order to add 2 numbers we need 2 values for this functions
     * each values is a string of number form 0 to 9
     * 
     * @param s1 the first string of numbers.
     * @param s2 the second string of numbers.
     * @return result is sum of 2 .string of numbers
     */
     public String sum(String s1 , String s2)
	{
		int balance = 0; // = 1 if plus 2 number > 9 else 0
                char value1 , value2; //use to keep single number
		int maxLenght = s1.length() > s2.length() ? s1.length() : s2.length(); // if lenght's string 1 > lenght's string 2 then maxstring = lenght's string1 else  lenght's string2
		String result = "";// use to keep result of this function;
		
		for(int i = 0 ; i < maxLenght ; i++) //carry out add 2 number . run from 0 to the longest lenght of string of numbers
		{
                        // 2 if check positions of every element in 2 string of numbers. then take values and be 0 if nothing
                        if(s1.length() - i-1 < 0)
                        {
                            value1 = '0';//be 0 if nothing
                        }else
                        {
                            value1 = s1.charAt(s1.length() - i-1);//take values
                        }
                        
                        if(s2.length() - i-1 < 0)
                        {
                            value2 = '0';//be 0 if nothing
                        }else
                        {
                            value2 = s2.charAt(s2.length()- i - 1) ;//take values
                        }
                        
			int sumTwoChar = value1 -'0' + value2 - '0' + balance;// add the first values and the second values and the balance
			balance = sumTwoChar / 10;//take balance
			result = ""+(sumTwoChar % 10)+result;//put next numbers to result
		}
		
		return result; // return the results
	}
    
}
