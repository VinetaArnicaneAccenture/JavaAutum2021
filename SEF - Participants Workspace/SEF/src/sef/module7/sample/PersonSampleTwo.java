package sef.module7.sample;

public class PersonSampleTwo {

	private String name;
	private int age;
	private int gender;
	final private String eyeColor="Blue";
	
	public PersonSampleTwo(String name, int age){
		setName(name);
		setAge(age);
	}
	public PersonSampleTwo(String name, int age, int gender){
		setName(name);
		setAge(age);
		setGender(gender);
	}

	public final void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("Name cannot be null!");
		}
		this.name = name;
	}
	
	public  String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	public void setGender(int gender){
		switch (gender)
		{
			case 1:
				;
			case 2:
				this.gender=gender;
				break;
			default:
				throw new IllegalArgumentException("Illegal gender!");
		}
	}
	public int getGender(){
		return gender;
	}
	
	public final void setAge(int age){
		if(age < 0){
			throw new IllegalArgumentException("Age cannot be negative!");
		}
		this.age = age;
	}
}
