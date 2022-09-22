package oop;

public class Dog extends Animal{
	
	//overriding
	public void eat()
	{
		System.out.println("Eating dog food");
		super.eat();
	}
	
	//overloading
	public void eat(String food)
	{
		System.out.println("Eating "+food);
	}
	
	public void run()
	{
		System.out.println("Running");
	}

}
