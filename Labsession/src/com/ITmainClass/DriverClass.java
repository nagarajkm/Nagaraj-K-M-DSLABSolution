package com.ITmainClass;

import java.util.Scanner;

import com.EmployeeInformation.Employee;

import com.serviceMethod.ServiceClass;


public class DriverClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the first name");
		String firstname=sc.next();
		System.out.println("Enter the last name");
		String lastname=sc.next();
		
		System.out.println("Enter the Department name");
		System.out.println("1. Technical");
		System.out.println("2. Admin ");
		System.out.println("3. Hr Department");
		System.out.println("4. legal Department");
		int choice=sc.nextInt();
		String email=null;
		String password=null;
		ServiceClass service=new ServiceClass();
		ServiceClass genpass=new ServiceClass();
		ServiceClass showcre=new ServiceClass();
		
		if(choice==1) {
			Employee emp=new Employee(firstname, lastname, "Technical");
			email=service.generateEmail(firstname, lastname,"Technical");
			password=genpass.generatepassword();	
			showcre.showcredential(firstname);
			System.out.println("Email----->:"+email);
			System.out.println("Password----->:"+password);
		}else if(choice==2)
		{
			Employee emp=new Employee(firstname, lastname, "Admin");
			email=service.generateEmail(firstname, lastname,"Admin");
			password=genpass.generatepassword();	
			showcre.showcredential(firstname);
			System.out.println("Email----->:"+email);
			System.out.println("Password----->:"+password);
		}
		else if(choice==3)
		{
			Employee emp=new Employee(firstname, lastname, "Hr Department");
			email=service.generateEmail(firstname, lastname,"HrDepartmen");
			password=genpass.generatepassword();
			showcre.showcredential(firstname);
			System.out.println("Email----->:"+email);
			System.out.println("Password----->:"+password);
		}
		else if(choice==4)
		{
			Employee emp=new Employee(firstname, lastname, "legal Departmentl");
			email=service.generateEmail(firstname, lastname,"legalDepartment");
			password=genpass.generatepassword();	
			showcre.showcredential(firstname);
			System.out.println("Email----->:"+email);
			System.out.println("Password----->:"+password);
		}else {
			System.out.println("enter valid input");
		}
	}

}
