/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprograms;

/**
 *
 * @author HP
 */
public class operators {
    public static void main(String args[]){
        
        // Operatos are used to perform operations on the Operands(variables and values)
        
        //ARITHMETIC OPERATORS
        
        int a = 25 , b = 5;
        System.out.println("Addition ('+' operator used ): " + (a+b));
        System.out.println("Subtraction ('-' operator used): " + (a-b));
        System.out.println("Multiplication ('*' operator used ): " +(a*b));
        System.out.println("Division ('/' operator used) " + (a/b));
            // '/' opeartor provides the quotient as result '%' operator provides the remainder as result
        System.out.println("Modulus ('%' operator used): "+(a%b));
        System.out.println("Increment ('++' operator used) "+(++a));
        System.out.println("Decrement ('--' operator used) "+(--a));
            /* increment and decrement again has pre and post increments and pre and post decrements
                pre means decremented or incremented before getting printed (represented as [--x (or) ++x])
                post means decremented or incremented after getting printed (represented as [x-- (or) x++])*/
            
            
        // ASSIGNMENT OPERATORS
        //Example: x = 10 here; RHS is 10 and LHS is x. RHS is assigned to LHS
        int c = 5 ;
        System.out.println("Addition assignmrnt ('+=' operator used ): " + (c += 3));
            // c += 3 is ssimilar to c = c + 3 i.e; 5+3 = 8 = c
        System.out.println("Subtraction assignment ('-=' operator used): "+ (c -= 3));  // here c becomes 5 i.e; 8-3
        System.out.println("Multiplication assignment ('*=' opearator used ): "+( c *= 3)); //here c becomes 15 i.e; 5*3
        System.out.println("Division assignment ('/=' operator used ): "+ (c /= 3)); // here c becomes 5 i.e; 15/3
        System.out.println("Modulus assignment ('%=' opearator used ): "+ (c %= 3)); //here c becomes 2 i.e; 5/3 remainder = 2
        
        // BITWISE OPERATORS combined with assignment operators
        System.out.println("AND assignment ('&=' operator used ): "+ (c &= 1)); // here c becomes 0 i.e; bitwise AND operation [0010(2) & 0001(1) = 0000(0)]
        System.out.println("OR assignment ('|=' operator used ): "+ (c |= 1));  //here c becomes 1 i.e; bitwise OR operaator [0000(0) | 0001(1) = 0001(1)]
        System.out.println("XOR assignment ('^=' operator used): "+ (c ^= 1));  // here c becomes 0 i.e; bitwise XOR operator [0001(1) ^ 0001(1) = 0000(0)]
        System.out.println("right shift assignment ('>>=' operator used ): "+ (c >>= 2)); // here c becomes 0 i.e; right shift of 2 bits and left empty places is filled with 00
        System.out.println("left shift assignment ('<<=' operator used ): "+ (c <<= 2)); //here c becomes 0 i.e; left shift of 2 bits and righrt empty places is filled with 00
        
        // COMPARISON OPERATORS
        // RETURNS BOOLEAN value as result
        int p = 19, q = 23 ;
        System.out.println("equality check ('==' operator used)" +(p == q));
        System.out.println("not equality ('!=' operator used)"+(p != q));
        System.out.println("greater than ('>' operator used)"+(p > q));
        System.out.println("greater than/equal to ('>=' operator used)"+(p >= q));
        System.out.println("less than ('<' operator used)"+(p < q));
        System.out.println("less than / equal to ('<=' operator used)"+(p <= q));
        
        //LOGICAL OPEARATORS
        //cheks both the conditions and returns boolean value as result
        System.out.println("Logical AND ('&&' operator used)"+ ((p > 2 )&&(q > 20))); // here it results TRUE as both the conditions given are TRUE or else FALSE
        System.out.println("Logical OR ('||' operator used)" + ((p == 2) || (q <= 20))); // here it returns FALSE as both the conditions given are FALSE or else TRUE
        System.out.println("Logical NOT ('==' operator used)" + (!(p == 2) || (q <= 20))); //here it results TRUE as both conditions are FALSE and applying logical OR results FALSE and then applying NOT to FALSE becomes TRUE
        
        //TERNARY OPERATOR: (short hand if else)
        // SYNTAX: datatype variable = condition ? true_expression : false_expression;
        
        String v = (c > 5) ? "yes" : "no";
        System.out.println(v);
    
    }
}
