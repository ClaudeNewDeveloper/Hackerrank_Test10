/*
 Task: 
Given a base-10 integer,n , convert it to binary (base-2). Then find and print the base-10 integer denoting 
the maximum number of consecutive 1's in n's binary representation.

Input Format

A single integer, n.

Constraints
    1 <= n <= 10^6

Output Format

Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.
 */

package hackerranktest10;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author besthon1
 */
public class Hackerranktest10 {

    /**
     * @param args the command line arguments
     * @param stackOfBinaryNumbers the stack that will host the digits of the binary number
     */
    
    public static Stack stackOfBinaryNumbers = new Stack();
    
    public static void ConvertDecimalToBinary(int n)
    {
        int remainder;
        int quotient = n;
         
        
        while (quotient > 0)
        {
            remainder = quotient % 2;
            
            quotient = quotient / 2;
            
            stackOfBinaryNumbers.add(remainder);
        }
        
         int[] arrayOfDigits  = new int[stackOfBinaryNumbers.size()];
        
        int maxNumberOfConsecutiveOnes = 0;
        int maxNumberOfConsecutiveDigitOnes = maxNumberOfConsecutiveOnes;
        
        System.out.print("displaying " + n + " in binary: ");
         
        for(int i = stackOfBinaryNumbers.size() - 1; i >= 0; i--)
        {  
            arrayOfDigits[i] = (int) stackOfBinaryNumbers.get(i);
            
            System.out.print(arrayOfDigits[i]);
            
        }
        
          System.out.println();
        
        for(int i = 0; i < arrayOfDigits.length ; i++)
        { 
           if(arrayOfDigits[i] == 1) 
               maxNumberOfConsecutiveOnes++;
           
           else if(maxNumberOfConsecutiveDigitOnes < maxNumberOfConsecutiveOnes)
           {
               maxNumberOfConsecutiveDigitOnes = maxNumberOfConsecutiveOnes;
               maxNumberOfConsecutiveOnes = 0;
           }
           
           else 
               maxNumberOfConsecutiveOnes = 0;
               
        }
        
          if(maxNumberOfConsecutiveDigitOnes < maxNumberOfConsecutiveOnes)
           
               maxNumberOfConsecutiveDigitOnes = maxNumberOfConsecutiveOnes;
             
            
        System.out.println();
        System.out.println("the maximum number of consecutive 1's is: " + maxNumberOfConsecutiveDigitOnes);
        
        System.out.println();
        
    }
    
    public static void main(String[] args) 
    {             
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please, enter the value of n: ");
        int n = in.nextInt();
       
        if(n > 0)
        { 
            ConvertDecimalToBinary(n);
        }
        else
            System.out.println("n should be greater then 0!");
        
        
    }
    
}
