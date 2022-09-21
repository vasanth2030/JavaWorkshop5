package oop;

public class Animal {
	private String name;
	private String habitat;
	
	Animal(){}
	
	Animal(String name, String habitat)
	{
		this.name=name;
		this.habitat=habitat;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
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
