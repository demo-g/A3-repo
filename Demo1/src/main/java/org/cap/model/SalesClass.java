package org.cap.model;

public class SalesClass {

	int arr[]= {10,20,50,30};
	public void sales()
	{
		System.out.println("This is SalesClass");
	}

	public void print()
	{

		for(int num:arr)
				System.out.println(num);
		System.out.println("This is developer 1");
System.out.println("Enhanced for loop");

		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("THis is developer 2");
		System.out.println("Normal For loop ");		

	}
}
