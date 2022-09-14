package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your age: ");
//		int age=sc.nextInt();
//		if(age>18)
//		{
//			System.out.println("You are an adult");
//		}
		
		
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
//		if(n%2==0)
//		{
//			System.out.println("Even number");
//		}
//		else {
//			System.out.println("Odd number");
//		}
		
		
//		System.out.println("Enter your mark: ");
//		int mark=sc.nextInt();
//		if(mark>=85)
//		{
//			System.out.println("A grade");
//		}
//		else if(mark>=65)
//		{
//			System.out.println("B grade");
//		}
//		else if(mark>=45)
//		{
//			System.out.println("C grade");
//		}
//		else {
//			System.out.println("Fail");
//		}

		
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Enter a valid input");
		}
		
		System.out.println("End of program");
	}

}
