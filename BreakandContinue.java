/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class BreakandContinue {
    public static void main(String args[]){
        
        // BREAK is used to jump out of the loop
        // CONTINUE is used to break only that one iteration of that loop
        
        //Question: Write a Java program that loops through numbers from 1 to 20. If a number is divisible by 3, skip that number using continue. If the number is greater than 15, stop the loop using break.
        
        for (int i = 1; i <= 20; i++){
            
            if (i % 3 == 0){
                continue;
            }
            
            if (i > 15){
                break;
            }
            System.out.println(i);
        }
    }
}
