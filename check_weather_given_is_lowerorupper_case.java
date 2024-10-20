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

public class check_weather_given_is_lowerorupper_case {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the alphabet(UPPER or lower):");
        String character = sc.nextLine();
        char ch = character.charAt(0);
        int a = (int) ch;
        
        // the ASCII code from a to z is 65 to 90 respectively and A to Z is 97 to 122
        
        if(a >= 65 && a <= 90){
            System.out.println("It is an upper case letter.");
        }
        else{
            System.out.println("It is an lower case letter.");
        }
    }
}
