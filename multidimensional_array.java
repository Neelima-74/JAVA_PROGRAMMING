/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class multidimensional_array {
    public static void main (String args[]){
        
        // A Multidimensinal array is array of arrays which is used to store vales in the form of tables like rows and columns.
        
        // CREATING A MULTIDIMENSINAL ARRAY:
        int[][] numbers = {{1,2,3},{4,5,6}};
        
        // ACCESSING MULTIDIMENSINAL ARRAY ELEMENT:
        System.out.println(numbers[1][1]);
        
        //CHANGING ARRAY ELEMENT:
        numbers [1][2] = 98;
        
        //Loop through array
        for (int i = 0; i < numbers.length; ++i){
            for(int j = 0; j < numbers[i].length; ++j){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
