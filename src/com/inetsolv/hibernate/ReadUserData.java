package com.inetsolv.hibernate;

import java.util.Scanner;

public class ReadUserData {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee ID: ");
		int eno=sc.nextInt();
		
		System.out.print("Enter employee name: ");
		String ename=sc.next();
		
		System.out.print("Enter employee salary");
		Double salary=sc.nextDouble();
		
		Employee e=new Employee();
		e.setEno(eno);
		e.setEname(ename);
		e.setSalary(salary);	
		
		StoreData sd=new StoreData();
		sd.storeEmpData(e);
	}

}
