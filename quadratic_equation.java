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

public class quadratic_equation {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x^2 coefficient:");
        int a =sc.nextInt();
        System.out.println("enter x coefficient:");
        int b =sc.nextInt();
        System.out.println("enter constant:");
        int c =sc.nextInt();
        
        System.out.println(a+"x^2+"+b+"x+"+c+"=0");
        
        /*
        determinant i.e; D = b^2-4*a*c decides the nature of roots.
        if D > 0 , then the roots are real;
        if D = 0 , then the roots are real and equal
        if D < 0 , then the roots are imaginary
        */
        
        // if the coffiecint of x^2 i.e; a = 0 then it is not an quadratic equation
        
        int D = b*b - (4*a*c);
        System.out.println(D);
        
        if (a == 0){
            System.out.println("Invalid Coefficients");
        }
        else if (D > 0) {
            System.out.println("roots of the equation are: " + ((float)(-b+Math.sqrt(D))/(2*a)) +", "+ ((float)(-b-Math.sqrt(D))/(2*a)));
        }
        else if (D == 0) {
            System.out.println("roots of the equation are: " + ((float)(-b+Math.sqrt(D))/(2*a)) +", "+ ((float)(-b-Math.sqrt(D))/(2*a)));
        }
        else if (D < 0) {
            System.out.println("roots of the equation are: ");
            System.out.println((double)(-(b/(2*a))) + "+"+ (float)((D^(1/2))/(2*a)) +"i");
            System.out.println((double)(-(b/(2*a))) + "-"+ (float)((D^(1/2))/(2*a)) +"i");
        }
        
        
    }
}
