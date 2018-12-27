/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add2numbers;

/**
 *
 * @author T.T.Vy
 */
public class CheckingInput {
    /**
     * 
     * @param s1 string 1
     * @param s2 string 2
     * @throws Exception if there is any unacceptable characters in 2 strings.
     */
    
    public void check (String s1 , String s2) throws Exception 
    {
        //use 2 loop for to find unacceptable character in 2 strings
        if (s1 == null || s2 == null)
        {
            throw new Exception("one of 2 edit text is empty");
        }
        for (int i = 0 ; i < s1.length() ; i++)
        {
            if (s1.charAt(i) > '9' || s1.charAt(i) < '/')
            {
                throw new Exception("found unacceptable character in 2 strings");
            }
        }
        for (int i = 0 ; i < s2.length() ; i++)
        {
            if (s2.charAt(i) > '9' || s2.charAt(i) < '/')
            {
                throw new Exception("found unacceptable character in 2 strings");
            }
        }
    }
    
}
