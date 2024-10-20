/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */

import java.util.Scanner;

public class find_average_of_ages {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of persons:");
        int n = sc.nextInt();
        
        int[] ages = new int[n] ;
            //dynamic input of array
            
        for (int i = 0; i < n; i++){
            System.out.print("Age of Person "+ (i+1) + ":");
            ages[i] = sc.nextInt();
        }
        
        int sum = 0;
        
        for (int i = 0; i < ages.length; i++){
            sum = sum + ages[i];
        }
        
        System.out.println("sum of the ages: " + sum);
        
        float average = sum / n ;
        
        System.out.println(average);
    }
}
