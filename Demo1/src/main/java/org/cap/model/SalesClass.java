package org.cap.model;

public class SalesClass {

	int arr[]= {10,20,50,30};
	public void sales()
	{
		System.out.println("This is SalesClass");
	}

	public void print()
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			System.out.println(arr[i]);
		}
	}
}
