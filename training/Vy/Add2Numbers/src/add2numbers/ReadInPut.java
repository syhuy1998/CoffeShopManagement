/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add2numbers;

import java.util.Scanner;

/**
 *
 * @author T.T.Vy
 * this functions use for read input form user
 */
public class ReadInPut {
     /**
     * 
     * @param number is a string of numbers get from user.
     * @return result is a string of numbers
     */
    
    public String FirstInput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the firts number : ");
        String number = sc.nextLine();

        return number;
    }
    
    public String SecondInput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the firts number : ");
        String number = sc.nextLine();

        return number;
    }
    
    
}
