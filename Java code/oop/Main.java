package oop;

public class Main {
	public static void main(String[] args) {
//		Animal dog=new Animal("Labrador","Land"); 
		Dog dog=new Dog();
		
//		dog.name="";
//		dog.setName("Chippiparai");;
//		System.out.println(dog.getName());
		
		dog.eat();
		dog.eat("Chicken");
		dog.run();
		dog.sleep();
	}

}
