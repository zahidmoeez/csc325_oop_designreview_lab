package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Creating Freshman and Senior instances
		Student std1 = new Freshman("James", (short) 20, 12); // name, age, credits
		Student std2 = new Senior("John", (short) 30, 90);

		// Setting the GPA of the students
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter GPA for " + std1.getName() + ": ");
		double gpa1 = scanner.nextDouble();
		std1.setGpa(gpa1);

		System.out.print("Enter GPA for " + std2.getName() + ": ");
		double gpa2 = scanner.nextDouble();
		std2.setGpa(gpa2);

		// Printing out student details
		System.out.println(std1);
		System.out.println(std2);

		// Closing the scanner
		scanner.close();

		// ToDo 13: Add comments and explain your code
		// This code demonstrates creating instances of Freshman and Senior,
		// setting their GPA using user input, and printing their details.
	}
}
