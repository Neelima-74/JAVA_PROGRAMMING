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
    // java util(utility pacakage) has the scanner method to access input from the user

public class maximumof3numbers {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first number: ");
        int a = sc.nextInt();
        System.out.println(" enter second number: ");
        int b = sc.nextInt();
        System.out.println(" enter third number: ");
        int c = sc.nextInt();
        
        if(a > b){
            if (a > c){
                System.out.println(a +" is bigger");     
            }
            else {
                System.out.println(c +" is bigger");
            }              
        }
        else {
        if (b > c){
                System.out.println(b +" is bigger");
            }
            else{
                System.out.println(c +" is bigger");
            }
        }
        
        // using ternary opoerator:
        
        int big = (a > b) ? ((a > c)? a : c) :((b > c)? b : c);
        System.out.println(big);
    }
}
