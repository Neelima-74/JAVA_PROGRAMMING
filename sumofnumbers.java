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

public class sumofnumbers {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        
        System.out.println("enter the nth number: ");
        int a =sc.nextInt();
        int sum =0;
        for (int i=1; i<=a; i++){
        System.out.println(i);
        sum = sum + i;
        }
        System.out.println("sum of first "+ a +" natural numbers is: "+sum);
        
        
        // Some modification that staring and ending number to be given by the user
        
        
        System.out.println("Enter the starting number:");
        int Start_num = sc.nextInt();
        System.out.println("Enter the last number:");
        int Last_num = sc.nextInt();
        int sum_num = 0 ;
        
        for (int i = Start_num ; i <= Last_num; i++){
            sum_num = sum_num + i;
        }
        System.out.println("sum of numbers from " + Start_num + "to " + Last_num +"is : "+ sum_num);
    }
}
