package basicJava;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {  
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1= sc.nextInt();
		int num2=sc.nextInt();
		sum(num1, num2);
		System.out.println("Diff: "+diff(num1, num2));
		System.out.println("Success");
	}
	
	public static void sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum: "+sum);
	}
	
	public static int diff(int a, int b)
	{
		int diff= a-b;
		return diff;
	}

}
