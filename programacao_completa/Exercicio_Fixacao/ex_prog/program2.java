package ex_prog;

import java.util.Locale;
import java.util.Scanner;

import ex_entity.Employee;

public class program2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.println("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update datat: " + emp);
		
		
		sc.close();
	}

}
