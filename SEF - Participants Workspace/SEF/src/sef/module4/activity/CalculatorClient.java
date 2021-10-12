package sef.module4.activity;

/**
 * @author
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		
		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");

		int x=4;
		int y=5;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		// Add 
		int result = normalCalc.add(x, y);
		System.out.println("1) Add result is " + result);
		
				
		// Multiply 
		int[] mul = {2, 3, 4};
		result = normalCalc.multiply(mul);
		System.out.println("2) Multiplication result is " + result);

       // substract
		result = normalCalc.subtract(x, y);
		System.out.println("3) Substract result is " + result);

		// divide
		result = normalCalc.divide(x, y);
		System.out.println("3) Divide result is " + result);


	}


	

}
