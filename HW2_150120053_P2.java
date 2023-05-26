//Name: Necati
//Surname: Koçak
//Student ID: 150120053

/*Problem: Write a program that displays the day of the week when the user enters year, month, and day.*/

import java.util.Scanner; //Scanner is in the java.util package


public class HW2_150120053_P2 {

	public static void main(String[] args) {
		//We create a Scanner object
		Scanner input = new Scanner(System.in);

		int year, month, numberofday, century, yearofcen, dayofweek;
		//Prompt the user to enter year
		System.out.print("Enter year (e.g. 2012): ");
		year = input.nextInt();
		//Prompt the user to enter month
		System.out.print("Enter month (e.g. 1-12): ");
		month = input.nextInt();
		//Prompt the user to the day of the week
		System.out.print("Enter the day of the month (e.g. 1-31): ");
		numberofday = input.nextInt();
		//January and February count as 13 and 14 in the formula, so if 1 or 2 is entered we convert to 13 and 14 and subtract 1 year. 
		if (month == 1 || month == 2) {
			month += 12;
			year--;
		}
		century = year / 100;
		yearofcen = year % 100;
		dayofweek = (numberofday + 26 * (month + 1) / 10 + yearofcen + yearofcen / 4 + century / 4 + 5 * century) % 7;
		//After performing the operations in the formula, we display the results accordingly.
		if (dayofweek == 0) {
			System.out.print("Day of the week is Saturday.");
		} else if (dayofweek == 1) {
			System.out.print("Day of the week is Sunday.");
		} else if (dayofweek == 2) {
			System.out.print("Day of the week is Monday.");
		} else if (dayofweek == 3) {
			System.out.print("Day of the week is Tuesday.");
		} else if (dayofweek == 4) {
			System.out.print("Day of the week is Wednesday.");
		} else if (dayofweek == 5) {
			System.out.print("Day of the week is Thursday.");
		} else if (dayofweek == 6) {
			System.out.print("Day of the week is Friday.");
		}

	}

}
