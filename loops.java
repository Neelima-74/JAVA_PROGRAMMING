/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class loops {
    public static void main(String args[]){
        
        //loops execute a block of code as long as the specific condition is reached.
        
        // WHILE loop gets executed untill the given condition beomes false.
        /*
        WHILE LOOP: 
        
        while(test condition){
             
            a block of code or statements to be executed if the test condition is true;
        
            incremental or decremental condition;
        
        }
        */
        
        //Example: write a program that prints even numbers from 0 to 10
        int a = 0;
        
        while ( a <= 10 ){
            System.out.println(a);
            a = a + 2 ;
            // if the variable is not set to increment or decrement it will run upto infinity
        }
        
        // if it is given you have to 1 as the initialing value
        
        int b = 1 ;
        while ( b <= 10 ){
            if( b % 2 == 0){
                System.out.println(b);
            }
            b = b + 1 ;
        }
        
        /*
        DO WHILE LOOP :
        it is an variant of while loop which gets iterated once before checking the test condition
        where as in while loop, it first under go testing with condition and then iterated.
         
        SYNTAX:
        
        variable initialization and assignment ;
        
        do {
            
            block of code to be executed ;
        
            incremental or decremental statement ;
        
        } while (test condition)
        
        */
        
        // Example: write a program that print odd number 1 to 10
        
        int c = 1;
        
        do {
            System.out.println(c);
            c = c + 2 ;
        }while( c <= 10 );
        
        /*
        FOR loop is used when you know how many iterations need to be done.
        
        SYNTAX:
         for(datatype variable initalisation; test condition; counter value){
        
             block of code to be executed;
        
        }
        */
        
        // Example: write a program to find factorial of a number'
        int n=1;
        for (int i = 1 ; i <= 5; i++){
            n = n * i;           
        }
        System.out.println(n);
        
        // NESTED LOOP: 
        /*
        program to get a pattern as 
        
        *****
        ****
        ***
        **
        *
        
        */
        
        
        for (int  i = 1 ; i <= 5;  i++){
            
            for (int j = 5 ; j >= i ; j--){
            
                     System.out.print("*");
            }
            System.out.println();
        }
        
        // FOR EACH:
        // it is especially used for iteration over elements in an array 
        
        /*
        SYNTAX:
        
        for (datatype temporary variable : arrayname){
            // block of code to be executed 
        }
        */
        
        int[] num = {1,2,3,4,5};
        
        for (int i : num){
            System.out.print(i );
        }
        
    }
}
