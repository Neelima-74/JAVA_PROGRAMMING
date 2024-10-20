/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class string {
    public static void main(String args[]){
        
        // STRINGS sre used to store text.
        
        // creating a string
        String my_var = "HELLO, This is a String";
        
        // finding length of string including white spaces(can be found using string_variable.length() method). 
        System.out.println("Lenth of the given String is: "+ my_var.length());
        
        // converting the whole string into uppercase letters using string_variable.toUpperCase() method.
        System.out.println("Converted to Uppercase: "+ my_var.toUpperCase());
        
        //converting the whole string to lowercase using string_variable.toLowerCase() method
        System.out.println("converted to lowercase: "+my_var.toLowerCase());
        
        //finding the index of the string or any character of a string using string_variable.indexOf() method.(it gives the index of first occured character)
        System.out.println("Index of 't' is: "+ my_var.indexOf("t"));
        
        //returns the character at specific index
        System.out.println("character at index 5 is: "+ my_var.charAt(5));
        
        //returns the unicode of the specified index
        System.out.println("unicode of character at index 5 :" + my_var.codePointAt(5) );
        
        // results in unicode of character before the specified index
        System.out.println("unicode of character at index 4 :"+ my_var.codePointBefore(5)+ " and the element is "+ my_var.charAt(4));
        
        //results in unicode of character count
        // here 9 is the start string index and 11 is the end string index
        System.out.println("number of unicode character : "+ my_var.codePointCount(9,11));
        
        // comparison of strings lexicographically(the way we perform search in dictionary)
        //results 1 if same else 0
        String my_var1 = "This is second String.";
        System.out.println(" my_var and my_var1 are same. true or false?  " + my_var.compareTo(my_var1));
        
        // comparison of strings ignoring the case
        //results 1 if same or else 0
        String my_var2 =" THIS IS seCOnd STRing";
        System.out.println("is my_var1 and my_var2 same? "+ my_var1.compareToIgnoreCase(my_var2) );
        
        // appending the text to another i.e; cancatination
        System.out.println("my_var conactinated with my_var1 :"+ my_var.concat(my_var1));
        
        //checking whether it conatains a sequence of characters
        System.out.println("my_var contain the 'this' in it. "+ my_var.contains("this"));
        
        /*
        for new line character use \n (moves cursor to new line), 
        for carriage return use \r (moves cursor to beginning of the current line), 
        for tab space use \t,
        for backspace use \b
        for printing the double or single quote or backslash use '\' before
            Example: System.out.println("it \' s my favorite \" pen \""); 
        */
        
    }
}
