package sef.module8.sample;
// Needs to be completed
public class ExceptionDeclarationSample {

	public static void setAge(int age){		
		if(age < 0 ){
			//1 - Throw an instance of  IllegalArgumentException with a String parameter
			//The parameter passed would be printed in the output
			try {

			} catch (IllegalArgumentException exception) {
				// Catch expected IllegalArgumentExceptions.
				//Logging.log(exception);
			} catch (Exception exception) {
				// Catch unexpected Exceptions.
				//Logging.log(exception, false);
			}
		}
	}


	public static void main(String arg[]){
		//2 - Call setAge with a negative parameter
		ExceptionDeclarationSample exceptionDeclarationSample = new ExceptionDeclarationSample();
		exceptionDeclarationSample.setAge(-5);
		
	}
}
