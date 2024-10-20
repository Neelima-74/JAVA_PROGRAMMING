/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class typecasting {
    public static void main(String args[]){
        
        // widening is the process of converting a smaller datatype to larger data type
        // it can be done automatically
        int a = 5;
        double b = a;
        System.out.println(b);
        
        // NARROWING is the process of converting the larger datatype to smaller datatype 
        // it has to be done manually
        double x = 9.54d;
        int y = (int) x;
        System.out.println(y);
        
    }
}
