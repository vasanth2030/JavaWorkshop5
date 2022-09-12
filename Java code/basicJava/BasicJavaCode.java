package basicJava;

import java.util.Scanner;

public class BasicJavaCode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name= sc.next();
		sc.nextLine();
		System.out.println("Enter your age: ");
		int age= sc.nextInt();
		System.out.println("Enter your height: ");
		float height= sc.nextFloat();  //(float)178.5 //typecasting
			
		System.out.println("Hello world");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"cm");
	}

}
