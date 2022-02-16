/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 6095627
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static int numProblems = 0;
    public static int numCorrect = 0;
    
    public static void main(String[] args) {
        
        int repeat;
        System.out.println("How many times do you wish to practice?");
        Scanner keyboard= new Scanner(System.in);
        
        repeat = keyboard.nextInt();
        int ranNum1, ranNum2, ranOp;
        Random myRan = new Random();
        char mathOp;
                
        for (int i = 0; i < repeat; i++ )
        {
            ranNum1 = myRan.nextInt(10) + 1;
            ranNum2 = myRan.nextInt(10) + 1;
            ranOp = myRan.nextInt(4) +1;
            if (ranOp == 1)
            {
                mathOp = '+';
            }
            else if (ranOp == 2)
            {
                mathOp = '-';
            }    
            else
            {
                mathOp = '*';
            }
            calculate(ranNum1, ranNum2, mathOp);
         
        }
        summarize();
      //1. Create a for-loop that runs 10 times (or we ask the user how many times he/she wishes to practice)
      //   a.  Inside the for-loop, we will generate 2 random numbers between 1 & 10
      //   b.  Inside the for-loop,we will also generate 1 random number between 1 & 4, 
      //       where 1 = addition, 2 = subtraction, 3 = multiplication, 4 = division (use an if-statement)
      //   c.  call calculate method, passing it num1, num2 and the operator
      //
      //2. Call summarize method, to report statistics
        
        
        
    }
    
    public static void calculate(int num1, int num2, char operator)
    {
        //1.  Use an if-statement to determine whether to add, subtract, multiply, or divide
        //    a.  Calculate the correct answer
        int correctAnswer;
        int userAnswer;
        Scanner keyboard = new Scanner(System.in);
        if (operator == '+')
        {
            correctAnswer = num1 + num2;
        }
        else if (operator == '-')
        {
            correctAnswer = num1 - num2;
        }
        else
        {
            correctAnswer = num1 * num2;
        }
        
        
        //2.  Display the problem to the user & get their answer back:
        //    a.  Show the user the arithmetic problem
        //    b.  Ask the user for their answer
        System.out.println("What is " + num1 + operator + num2 + "?");
        userAnswer = keyboard.nextInt();
        
        //3.  Compare the user's answer to correct answer
        //    a.   if there is a match, add 1 to numCorrect (global variable).
        if (userAnswer == correctAnswer)
        {
            numCorrect = numCorrect + 1;
        }
        //4.  Regardless, add 1 to numProblems (global variable)
        numProblems= numProblems + 1;
        
    }
    
    public static void summarize()
    {
        
        //1.  Display the total correct & total problems
        System.out.println("The total number of problems was " + numProblems + ".");
        System.out.println("You answered " + numCorrect+ " problems correctly.");
        //2.  Calculate percent correct & display it
        double percentCorrect;
        percentCorrect = (double) numCorrect / numProblems;
        percentCorrect = percentCorrect * 100;
        System.out.println("You got "+ percentCorrect+ "% correct.");
        //3.  Use an if-statement to tell the user if they did well, average, poorly, or failed
        if (percentCorrect >= 90)
        {
            System.out.println("You did very well.");
        }
        else if (percentCorrect >=80)
        {
            System.out.println("You did well.");
        }
        else if (percentCorrect >=70)
        {
            System.out.println("You did okay.");
        }
        else
        {
            System.out.println ("You're better than this.");
        }
        
    }
    
}
