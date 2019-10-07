package Methods;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/** 
 * Class 8-1 Problem 1
 * Determining value or consonant
 * Thanh Tran
 * October 29, 2019
 */

public class LetterCheck {

    public static void letterCheck (char a) {
        if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
            System.out.println ("The character is a vowel");
        } 
        else 
        {
            System.out.println ("The character is a consonant");
        }
        } // end of method
   
    public static void main(String[] args) {
        
        int n;
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Start: 1 End: 0");
        n = input.nextInt();
        
        do {
        System.out.println ("Please enter a letter: ");
        String s = input.next();
        char c = s.charAt(0);
        letterCheck(c);
        
        } while(n == 1);
    }
    
}
