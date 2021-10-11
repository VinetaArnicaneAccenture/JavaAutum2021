package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		// Subtract numbers
		int result = i-j;
		// Print result
		System.out.println("Difference = " + result);
		
		// Add numbers
		int sum= i+j;
		System.out.println("Sum = " + sum);

		//experiment with multiplication and division
		System.out.println("Multiplication = " + (i*j));
		System.out.println("Division = " + (float)(i/j));
		System.out.println("Modulo = " + (float)(j%i));
	}
}
