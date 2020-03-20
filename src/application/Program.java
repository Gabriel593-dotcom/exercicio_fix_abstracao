package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LPerson;
import entities.PPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ic = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualRentability = sc.nextDouble();

			if (ic == 'i' || ic == 'I') {
				
				System.out.print("Health Expenditures: ");
				double healthCareCosts = sc.nextDouble();
				list.add(new PPerson(name, anualRentability, healthCareCosts));
			}

			else if (ic == 'c' || ic == 'C') {
				
				System.out.print("Number of Employees: ");
				int employeesQuantity = sc.nextInt();
				list.add(new LPerson(name, anualRentability, employeesQuantity));
			}

			else {

				System.out.println("Opção inválida.");
			}
			
			System.out.println("----------------------------------");
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(Person person : list) {
			
			System.out.println(person.dataPrint());
		}
		
		sc.close();

	}

}
