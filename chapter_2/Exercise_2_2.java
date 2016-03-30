/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */
 
 /*
 Exercise 2.2:
Write a program that simulates rolling a pair of dice. 
You can simulate rolling one die by choosing one of the integers 1, 2, 3, 4, 5, or 6 at random. 
The number you pick represents the number on the die after it is rolled. 
As pointed out in Section 2.5, the expression

(int)(Math.random()*6) + 1
does the computation to select a random integer between 1 and 6. 
You can assign this value to a variable to represent one of the dice that are being rolled. 
Do this twice and add the results together to get the total roll. 
Your program should report the number showing on each die as well as the total roll. For example:

The first die comes up 3
The second die comes up 5
Your total roll is 8
*/

/**
 *
 * @author ahrytsenko
 */
public class Exercise_2_2 {
    
    public static void main(String[] args) {
        
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        
        System.out.printf("The first die comes up %d\n", die1);
        System.out.printf("The second die comes up %d\n", die2);
        System.out.printf("Your total roll is %d\n", die1+die2);
        
    }
    
}
