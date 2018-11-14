/*
 * Anton dela Cruz
 * SubroutineProgram.java
 * This program prompts the user to choose a type of mathematical calculation for his/her 2 chosen numbers
 * November 12, 2018
 */

package subroutineprogram;

import java.util.Scanner;

/**
 *
 * @author andel7651
 */

public class SubroutineProgram {

    /**
     * @param args the command line arguments
     */
    
    // Instructing Seperate Functions
    
    public static void addAndOut (int n1, int n2)
    {  
        int sum = n1 + n2;
        System.out.println("The sum is " + sum);
        System.out.println("--------------------");
    }
    
    public static void subAndOut (int n1, int n2)
    {  
        int diff = n1 - n2;
        System.out.println("The difference is " + diff);
        System.out.println("--------------------");
    }
    
    public static void multAndOut (int n1, int n2)
    {  
        int product = n1 * n2;
        System.out.println("The product is " + product);
        System.out.println("--------------------");
    }
    
    public static void quotAndOut (int n1, int n2)
    {  
        int quot = n1 / n2;
        System.out.println("The quotient is " + quot);
        System.out.println("--------------------");
    }
    
    public static void powerOfTwo (int n1)
    {  
        int power = n1 * n1;
        System.out.println("The power equals " + power);
        System.out.println("--------------------");
    }
     
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
       
        System.out.println("-----Subroutine (Math) Program-----");
        System.out.println("");
        
        //Declaring Variables
        
        int num1, num2, choice;
        
        // Looping Selection Menu
        
        do {
            System.out.println("Option 1: Add 2 numbers");
            System.out.println("Option 2: Subtract 2nd number from the 1st");
            System.out.println("Option 3: Multiply 2 numbers");
            System.out.println("Option 4: Divide 1st number by 2nd number");
            System.out.println("Option 5: Raise number to base 2");
            System.out.println("Option 6: Exit");
            System.out.println("");
            System.out.println("Select Option: ");
            
            choice = keyedInput.nextInt();

            System.out.println("");
            
            if (choice == 1) {
            System.out.println("Enter the first number");
            num1 = keyedInput.nextInt();

            System.out.println("Enter the second number");
            num2 = keyedInput.nextInt();
            
            addAndOut (num1, num2);
        }
            
            else if (choice == 2) {
            System.out.println("Enter the first number");
            num1 = keyedInput.nextInt();

            System.out.println("Enter the second number");
            num2 = keyedInput.nextInt();
            
            subAndOut (num1, num2);
        }
            
            else if (choice == 3) {
            System.out.println("Enter the first number");
            num1 = keyedInput.nextInt();

            System.out.println("Enter the second number");
            num2 = keyedInput.nextInt();
            
            multAndOut (num1, num2);
        }
            
            else if (choice == 4) {
                
            System.out.println("Enter the first number");
            num1 = keyedInput.nextInt();

            System.out.println("Enter the second number");
            num2 = keyedInput.nextInt();
            
            quotAndOut (num1, num2);
        }
        
            else if (choice == 5) {
            System.out.println("Enter base number");
            num1 = keyedInput.nextInt();

            powerOfTwo (num1);    
        }
        
            else if  (choice == 6) { 
            System.out.println("Goodbye!");
            System.out.println("--------------------");       
        }
                   
        }
        while (choice != 6);
    }
}

        
