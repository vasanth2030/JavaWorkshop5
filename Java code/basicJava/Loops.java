package basicJava;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
//		int i=1;
//		while(i<=n)
//		{
//			System.out.println("Hello world "+i);
//			i+=2;  //i=i+2
//		}
//		System.out.println();
		
//		do {
//			System.out.println("Hello world "+i);
//			i++;
//		}while(i<=n);
//		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Hello world "+i);
		}
		System.out.println();
		
		System.out.println("Success");
	}
}
