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

public class find_grade {
    public static void main (String args[]){
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the TotalMarks scored: ");
        int total_marks = sc.nextInt();
        
        if(total_marks >= 90){
            System.out.println("GRADE A+");
        }
        else if(total_marks >= 80){
            System.out.println("GRADE A");
        }
        else if(total_marks >= 70){
            System.out.println("GRADE B");
        }
        else if(total_marks >= 60){
            System.out.println("GRADE C");
        }
        else if(total_marks >= 40){
            System.out.println("GRADE D");
        }
        else if(total_marks >= 90){
            System.out.println("GRADE E");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
