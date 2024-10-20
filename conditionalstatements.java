/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class conditionalstatements {
    public static void main (String args []){
        
        // IF is used to specify a block of code to be executed, if the given condition is true
        int age = 23;
        if (age == 18){
            System.out.println("Entered into voting eligibility.");
        }
        
        // ELSE IF is used to specify new condition to test, if the first IF condition is false
        else if ((age > 18) && (age <= 50)){
            System.out.println("Eligible to vote and doesn't need any support to vote");
        }
        
        else if (age > 50){
            System.out.println("Eligible to vote and may need support to vote.");
        }
        
        // ELSE is used to specify a block of code to be executed, if the given condition in IF case is false
        else{
            System.out.println("NOT Eligible for voting");
        }
        
        
        // IF ELSE using ternary operator which contains three operands a condition, true statement, false statement
        int Age = 41;
        String result = (Age >= 18) ? "Eligible to vote." : "Not Eligible to vote.";
        System.out.println(result);
        
        // SWITCH statement selects one of many code blocks to be executed
        int month = 8 ;
        switch (month){
            case 1 :
                System.out.println(" JANUARY ");
                // break of the switch block and ignores the rest of the code
                break;
            case 2 :
                System.out.println(" FEBRUARY ");
                break;
            case 3 :
                System.out.println(" MARCH ");
                break;
            case 4 :
                System.out.println(" APRIL ");
                break;
            case 5 :
                System.out.println(" MAY ");
                break;
            case 6 :
                System.out.println(" JUNE ");
                break;
            case 7 :
                System.out.println(" JULY ");
                break;
            case 8 :
                System.out.println(" AUGUST ");
                break;
            case 9 :
                System.out.println(" SEPTEMBER ");
                break;
            case 10 :
                System.out.println(" OCTOBER ");
                break;
            case 11 :
                System.out.println(" NOVEMBER ");
                break;
            case 12 :
                System.out.println(" DECEMBER ");
                break;
            // DEFAULT case is executed if any of the defined cases doesn't satisfied with the condition
            default: 
                System.out.println(" Not the month ");
                break;
        }
        
    
    }
}
