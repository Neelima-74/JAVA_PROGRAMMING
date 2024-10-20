/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class Datatypes {
    public static void main(String args[]){
    
        // variables can be declared and then assigned or else declaring and assigning can be done at once
        int a;
        a=2;
        System.out.println(a);
        
        // float value must be end with 'f' or else it shows error and 'd' for double
        float b = 12.23f;
        System.out.println(b);
        
        //String vlaues must be declared in double quotes
        String c = "string value ";
        System.out.println(c);
        
        //char datatype can also store one character and declared in single quotes. we can also use ASCII code of the character without quote
        char h = 'H';
        char d = 64;
        System.out.println(d);
        System.out.println(h);
        
        //boolean value can only store two value true or false
        boolean e = true;
        System.out.println(e);
        
        // values assigned can be over written
        a = 45;
        System.out.println(a);
        
        // if final variables are tried to over written, then it forms an error 
        // '+' is used to combine text and variable
        final int f = 25;
        System.out.println(f + " is one of the integer.");
        
        // same '+' is used to combine variables any datatype
        boolean another = true;
        String Combine = c + another;
        System.out.println(Combine);
        
        // same type variables can declared in a single line
        float first = 82.36f, second = 58.69f, third = 00.02f ;
        System.out.println(second);
        
        // multiple values getting assigned with single value
        int x,y,z;
        x = y = z = 41 ;
        System.out.println(x+y);
        
        /* variables can be uniquily identified using identifiers,
        can contain alphabets, numbers, underscore "-" and dollar "$",
        can begin with - and $,
        these are case sensitive,
        keywords can not be used. */
        
        
        /*Primitive data types - byte(1), short(2), int(4), long(8), float(4), double(8), boolean(1bit), char(2)
          non primitive datatypes (also called REFERENCE DATATYPES[because they refer to objects]) - String, arrays and classes etc*/
    
        /*primitive datatypes are predefined(must have a value, starts with lower case), non-premitive are created by the programmer
        (used to call methods to perform operations, can be null valued, starts with upper case).*/
    }
}
