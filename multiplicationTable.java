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

public class multiplicationTable {
    public static void main(String args[]){
        
        Scanner sc =new Scanner (System.in);
        
        System.out.println("Enter the number to get MULTIPLICATION TABLE:");
        System.out.println("MULITPLICATION TABLE IS:");
        
        int num = sc.nextInt();
        
        for (int i =1; i <= 10 ; i++){
            
            System.out.println(num +"*"+ i + "=" + (num * i));
        }
    }
}
