//Name: Necati
//Surname: Koçak
//Student ID: 150120053

/*Problem: //Write a program that calculates personal income tax based on the given tax rates reported 
 * by The Turkish Revenue Administration.*/

import java.util.Scanner; //We create a Scanner object

public class HW2_150120053_P3 {

	public static void main(String[] args) {
		//We create a Scanner object
		Scanner input = new Scanner(System.in);

		double year, income, realtaxrate, incomeaftertax = 0;
		//Prompt the user to enter the year and income.	
		year = input.nextDouble();

		income = input.nextDouble();

		double taxamount = 0; 
	    	// If the income is equal to zero or minus, we write the result.
		if (income > 0) {

		} else { 
			System.out.println("Income must be > 0");
			System.exit(1);
		} // Compute tax for 2020.
		if (year == 2020) {
			if (income <= 22000) {
				taxamount = (income * 0.15);
			} else if (income <= 49000) {
				taxamount = 3300 + (income - 22000) * 0.2;
			} else if (income <= 180000) {
				taxamount = 8700 + (income - 49000) * 0.27;
			} else if (income <= 600000) {
				taxamount = 44070 + (income - 180000) * 0.35;
			} else if (income >= 600000) {
				taxamount = 191070 + (income - 600000) * 0.40;
			} else {
			} // Compute tax for 2019.
		} else if (year == 2019) {
			if (income <= 18000) {
				taxamount = (income * 0.15);
			} else if (income <= 40000) {
				taxamount = 2700 + (income - 18000) * 0.2;
			} else if (income <= 148000) {
				taxamount = 7100 + (income - 40000) * 0.27;
			} else if (income <= 500000) {
				taxamount = 36260 + (income - 148000) * 0.35;
			} else if (income >= 500000) {
				taxamount = 159460 + (income - 500000) * 0.40;
			} else {
			} // Compute tax for 2018.
		} else if (year == 2018) {
			if (income <= 14800) {
				taxamount = (income * 0.15);
			} else if (income <= 34000) {
				taxamount = 2220 + (income - 14800) * 0.2;
			} else if (income <= 120000) {
				taxamount = 6060 + (income - 34000) * 0.27;
			} else if (income >= 120000) {
				taxamount = 29280 + (income - 120000) * 0.35;
			} // Compute tax for 2017.
		} else if (year == 2017) {
			if (income <= 13000) {
				taxamount = (income * 0.15);
			} else if (income <= 30000) {
				taxamount = 1950 + (income - 13000) * 0.2;
			} else if (income <= 110000) {
				taxamount = 5350 + (income - 30000) * 0.27;
			} else if (income >= 110000) {
				taxamount = 26950 + (income - 110000) * 0.35;
			} // If we write a year other than these 4 years, we write the answer we will get if we enter it.
		} else {
			System.out.println("Undefined year value.");
			System.exit(1);
		}
		realtaxrate = (taxamount / income) * 100;
		incomeaftertax = (income - taxamount);
		realtaxrate = (int) (realtaxrate * 100) / 100.0;
		taxamount = (int) (taxamount * 100) / 100.0;
		incomeaftertax = (int) (incomeaftertax * 100) / 100.0;
		// Display the results.
		System.out.println("Income: " + income);
		System.out.println("Tax amount: " + taxamount);
		System.out.println("Income after tax: " + incomeaftertax);
		System.out.println("Real tax rate: " + realtaxrate + "%");

	}

}
