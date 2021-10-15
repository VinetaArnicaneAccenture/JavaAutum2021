package sef.module7.sample;

public class SetterGetterSample{

	public static void main(String arg[]){
		
		//With exposed implementation, an object can have values passed to it
		//that may be contrary to it's design
		
		PersonSampleOne p1 = new PersonSampleOne();
		p1.name=null;
		p1.age=-1000;
		
		//Will not allow improper fields to be set by throwing an exception
		PersonSampleTwo p2 = new PersonSampleTwo("John Doe", 10, 2);
		System.out.println("Person's Name          : " +p2.getName());
		System.out.println("Person's Age          : " +p2.getAge());
		switch (p2.getGender())
		{
			case 1:
				System.out.println("Person's Gender          : Female");
				break;
			case 2:
				System.out.println("Person's Gender          : Male");
				break;
			default:
				throw new IllegalArgumentException("Illegal gender!");
		}


	}
}
