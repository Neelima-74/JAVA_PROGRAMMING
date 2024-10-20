/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class mathematics {
    public static void main (String srgs[]){
        
        // Math class in java has many methods to perform  mathematical opearations 
        
        //  to find the maximum of x or y
        System.out.println("Maximum of 14 and 23 is: "+ Math.max(14,23));
        
        // to find the minimum of x or y
        System.out.println("Minimum of 14 and 23 is: "+ Math.min(14,23));
        
        // to find the absolute positive value of x 
        System.out.println("Absolute positive value of -24.5 is: "+ Math.abs(-24.5));
        
        // to find the square root of x
        System.out.println("Square root of 64 is: "+ Math.sqrt(64));
        
        // getting random number inclusive of 0.0 and exclusive of 1.1 (it's default random operation)
        System.out.println("random number: "+ Math.random());
        // getting random number between 0 and 100
        System.out.println("random number from 0 and 100: "+ Math.random()*101 );
        
    }
}
