package array;

import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
//		find the sum of elements inside the array
//		int arr[]= {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");
			arr[i]= sc.nextInt();
		}
		
		printArray(arr);
	}
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
