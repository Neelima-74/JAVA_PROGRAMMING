/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class arrays {
    public static void main(String args[]){
        
        //ARRAY are used to store multiple homogenous (i.e; same datatype) variables in a single variable.
        /* DECLARATION OF ARRAY: (with the "SQUARE BRACKETS")
            SYNTAX:
                datatype[] arrayname;
        */
        
        /*
        ASSIGNMENT OF VALUES or INSERTION OF VALUES:
        SYNTAX:
            datatype [] arrayname = {value_1, value_2,,,,,,,,value_n};
                // if the datatype is string, then the values are written within double quotes.
                    Example: String[] colour = {"red", "green", "blue"}; 
        */
        
        int[] a ={1,2,3,4,5};
        
        /*
        ACCESSING AN ELEMENT:
        arrayname[index];
            //index starts from zero.
        */
        System.out.println(a[3]);
        
        /*
        CHANGE AN ARRAY ELEMANT:
        arrayname[index of changing variable] = new_value to be replaced;
        */
        
        a[3] = 34;
        System.out.println(a[3]);
        
        // LENGTH OF THE ARRAY:
        System.out.println(a.length);
        
        //Loops through arrays:
        for (int i = 0 ; i < a.length; i++){
            System.out.println(a[i]);
        }
        
        // using for each:
        for (int i : a){
            System.out.println(i);
        }
        
        /* in for loop i vaiable represents the index of the array element
             where as in the for each loop i variable represents the array element
        */
        
    }
}
