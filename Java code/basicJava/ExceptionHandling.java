package basicJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		division(num1, num2);
		System.out.println("Div: " + div(num1, num2));
		System.out.println("End of program");
	}

	public static int div(int a, int b) {
		int div=-1;
		try {
			div = a / b;
			throw new InputMismatchException("Manually thrown exception");
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("Enter a non-zero divisor");
		} catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Inside 'Exception' catch block");
		} finally {
			System.out.println("Inside finally");
			return div;
		}
	}
	
	public static int division(int a, int b) throws ArithmeticException
	{
		int div=a/b;
		return div;
	}

}
