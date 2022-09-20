package oop;

public class Animal {
	String name;
	String habitat;
	
	Animal(){}
	
	Animal(String name, String habitat)
	{
		this.name=name;
		this.habitat=habitat;
	}
	
	public void eat()
	{
		System.out.println("Eating");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}

}
