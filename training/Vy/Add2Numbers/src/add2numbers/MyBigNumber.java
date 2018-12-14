package add2numbers;

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
    
    public String sum(final String s1 ,final String s2)
    {
        int balance = 0; // = 1 if plus 2 number > 9 else 0.
        int sumTwoChar;//save temporary value
        char value1; //use to keep single number.
        char value2; //use to keep single number.
        int maxLenght = s1.length() > s2.length() ? s1.length() : s2.length(); //return lenght's s1 else  lenght's s2.
        String result = "";// use to keep result of this function.
        
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
            
            sumTwoChar = value1 - '0' + value2 - '0' + balance;// add all value together
            balance = sumTwoChar / 10;//take balance
            result = "" + (sumTwoChar % 10) + result;//put next numbers to result
        }
        
        return result; // return the results
    }
}
