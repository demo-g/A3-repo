package org.cap.boot;

import org.cap.model.EmployeeClass;
import org.cap.model.SalesClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainClass().print();
		new EmployeeClass().employee();
		new SalesClass().sales();
	}
	void print()
	{
		System.out.println("This is main class");
	}
	void secondMethod()
	{
		
	}
}
