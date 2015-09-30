// Week 3 Lab 6
import java.util.Scanner;

public class calculator {
	
     public static void main(String[] args){
    	 
    	 int number1;
    	 int number2;
    	 
    	 
    	 Scanner input = new Scanner(System.in);
    	 
    	 
    	 System.out.print("Enter first number: ");
    	 number1 = input.nextInt();
    	 
    	 System.out.print("Enter second number: ");
    	 number2 = input.nextInt();
    	 
    	 
    	
    	 System.out.printf("The sum of the numbers is:  %d\n", number1 + number2);
    	
    	 System.out.printf("The difference of the numbers is:  %d\n", number1 - number2);
    	 
    	 System.out.printf("The product of the numbers is:  %d\n", number1 * number2);
    	 
    	 System.out.printf("The remainder of the numbers is:  %d\n", number1 / number2);
    	 
    	 
	}
}
