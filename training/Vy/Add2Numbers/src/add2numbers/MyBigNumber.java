package add2numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author T.T.Vy
*this class contain a function name sum "use" for plus 2 numbers together
*/

public class MyBigNumber {
    
    /**
    * in order to add 2 numbers we need 2 values for this functions.
    * each values is a string of number form 0 to 9.
    * @param s1 the first string of numbers.
    * @param s2 the second string of numbers.
    * @return result is sum of 2 .string of numbers.
    */
    
    String StepResult = "";// in order to show step by step how this function work
    public String showSumWork()
    {
        return StepResult;
    }
    
    public String sum(final String s1 ,final String s2) throws Exception
    {
        int balance = 0; // = 1 if plus 2 number > 9 else 0.
        int balance1 = 0;//remenber balance before
        int sumTwoChar;//save temporary value
        int sumTwoCharWithoutbalance;//save temporary value
        int sum;//save temporary value
        char value1; //use to keep single number.
        char value2; //use to keep single number.
        int maxLenght = s1.length() > s2.length() ? s1.length() : s2.length(); //return lenght's s1 else  lenght's s2.
        String result = "";// use to keep result of this function.
        
        
        //use 2 loop for to find unacceptable character in 2 strings
        for (int i = 0 ; i < s1.length() ; i++)
        {
            if (s1.charAt(i) > '9' && s1.charAt(i) < '/')
            {
                throw new Exception("found unacceptable character in 2 strings");
            }
        }
        for (int i = 0 ; i < s2.length() ; i++)
        {
            if (s2.charAt(i) > '9' && s2.charAt(i) < '/')
            {
                throw new Exception("found unacceptable character in 2 strings");
            }
        }
            
        for (int i = 0 ; i < maxLenght ; i++) //run for o to the max lenght of strings.
        {
            // 2 if check positions of every element in 2 string . then take values and be 0 if nothing.
            if (s1.length() - i - 1 < 0)
            {
                value1 = '0';//be 0 if nothing
            } else
            {
                value1 = s1.charAt(s1.length() - i - 1);//take values
            }
                        
            if (s2.length() - i - 1 < 0)
            {
                value2 = '0';//be 0 if nothing
            } else
            {
                value2 = s2.charAt(s2.length() - i - 1) ;//take values
            }
            sumTwoCharWithoutbalance = value1 - '0' + value2 - '0';
            sumTwoChar = value1 - '0' + value2 - '0' + balance;// add all value together
            balance1 = balance;//save balance before which change new value
            balance = sumTwoChar / 10;//take balance
            result = "" + (sumTwoChar % 10) + result;//put next numbers to result
            sum = sumTwoChar % 10;
            StepResult = StepResult +"lay " + value1 + " cong " + value2 + " duoc " + sumTwoCharWithoutbalance + " " + balance1 + "nho"
            + " ghi " + sum + " nho " + balance  + "\n";//show step by step how this function works
        }
        if ( balance == 1)
        {
            return "1" + result;// return the results with remaining
        }
        else
        {
            return result;// return the results without remaining
        }
    }
}
