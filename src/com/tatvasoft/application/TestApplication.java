package com.tatvasoft.application;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.tatvasoft.controller.TblEmployeeControllerImpl;
import com.tatvasoft.model.TblEmployee;

public class TestApplication {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println("...................WelCome To Nirav's First Hibernate Application Demo....................");
		System.out.println("Please Enter Your Choice");
		System.out.println("...............................This is out user detail list..........................");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type 'add' for adding new user ");
		System.out.println("Type 'modify' for updating existing user");
		System.out.println("Type 'delete' for deleting existing user");
		String decision;
		decision =  scanner.next();
		TblEmployeeControllerImpl test = new TblEmployeeControllerImpl();
		int param1;
		Scanner scanner1 = new Scanner(System.in);
		if(decision.equals("add"))
		{System.out.println("New UserId:");
		param1 = Integer.parseInt(scanner1.next());}
		else
		{System.out.println("Existing UserId:");
		param1 = Integer.parseInt(scanner1.next());}

		if(!(decision.equals("delete"))){
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("New UserName");
			String param2 = scanner2.next();


			Scanner scanner3 = new Scanner(System.in);
			System.out.println("New FirstName");
			String param3 = scanner2.next();


			Scanner scanner4 = new Scanner(System.in);
			System.out.println("New LastName");
			String param4 = scanner2.next();

			Scanner scanner5 = new Scanner(System.in);
			System.out.println("New Password");
			String param5 = scanner5.next();

			Scanner scanner6 = new Scanner(System.in);
			System.out.println("New DateOfBirth");
			String param6 = scanner6.next();

			Scanner scanner7 = new Scanner(System.in);
			System.out.println("New EmailAddress");
			String param7 = scanner7.next();

			Scanner scanner8 = new Scanner(System.in);
			System.out.println("New MobileNumber");
			double param8 = Double.parseDouble(scanner8.next());

			Scanner scanner9 = new Scanner(System.in);
			System.out.println("Make it Active?(y/n):");
			char param9 = (scanner9.next()).charAt(0);


			TblEmployee tblemp = new TblEmployee(param1, param2, param3,param4,param5, param6, param7, param8, param9);


			if(decision.equals("add")){
				test.addEmployee(tblemp);
				System.out.println("User Succesfully Added");
			}
			else if(decision.equals("modify")){
				test.updateEmployee(tblemp);
				System.out.println("User Succesfully Modified");
			}
		}
		else if(decision.equals("delete")){
			test.deleteEmployee(param1);
			System.out.println("User Succesfully Deleted");
		}

		else{
			System.out.println("You have entered wrong input.Please Try Again");
		}	

	}

}
