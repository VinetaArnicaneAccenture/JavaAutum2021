package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
public static void main(String[] args) {
	TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
	obj.catchMeIfYouCan();
}

void catchMeIfYouCan()
{
	int [] arr={0,1,2,3,4,5,6,7,8,9};
/*
	for(int i=0;i<=10;i++)
	{
		System.out.println(arr[i]);
	}
*/

	try {
		for(int i=0;i<=10;i++)
		{
			System.out.println(arr[i]);
		}
	}  catch (IndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	} finally {
		System.out.println("Finally works always!");
	}

	System.out.println("This should get printed even if there is an exception");
	}

}
