//Name: Necati
//Surname: Koçak
//Student ID: 150120053

/*Problem: Write a program that checks ISBN-10. An ISBN-10 (International Standard Book Number) consists of 10 digits: ABCDEFKLMN.
 * The last digit, Z, is a checksum, which is calculated from the other nine digits using the formula*/

import java.util.Scanner;  //Scanner is in the java.util package

public class HW2_150120053_P1 {

	public static void main(String[] args) {
		//We create a Scanner object
		Scanner input = new Scanner(System.in);
		int ninedigits, firstdigit, seconddigit, thirddigit, fourthdigit, fifthdigit, sixthdigit, seventhdigit, eighthdigit,
				ninthdigit, tenthdigit;
		//Prompt the user to enter the first 9 digits of an ISBN as integer	
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");

		ninedigits = input.nextInt();
		
		//We split the entered number into digits.
		
		firstdigit = (int) ((int) ninedigits / Math.pow(10, 8));

		seconddigit = (int) ((int) ninedigits / Math.pow(10, 7) % 10);

		thirddigit = (int) ((int) ninedigits / Math.pow(10, 6) % 10);

		fourthdigit = (int) ((int) ninedigits / Math.pow(10, 5) % 10);

		fifthdigit = (int) ((int) ninedigits / Math.pow(10, 4) % 10);

		sixthdigit = (int) ((int) ninedigits / Math.pow(10, 3) % 10);

		seventhdigit = (int) ((int) ninedigits / Math.pow(10, 2) % 10);

		eighthdigit = (int) ((int) ninedigits / Math.pow(10, 1) % 10);

		ninthdigit = (int) ((int) ninedigits / Math.pow(10, 0) % 10);

		//We get the 10th digit with the formula.
		tenthdigit = (firstdigit * 1 + seconddigit * 2 + thirddigit * 3 + fourthdigit * 4 + fifthdigit * 5
				+ sixthdigit * 6 + seventhdigit * 7 + eighthdigit * 8 + ninthdigit * 9) % 11;

		System.out.print("The ISBN-10 number is ");
		//Display the result.
		System.out.print(firstdigit);
		System.out.print(seconddigit);
		System.out.print(thirddigit);
		System.out.print(fourthdigit);
		System.out.print(fifthdigit);
		System.out.print(sixthdigit);
		System.out.print(seventhdigit);
		System.out.print(eighthdigit);
		System.out.print(ninthdigit);

		//We wrote the code where we will write X instead of 10 if the last digit is 10.
		if (tenthdigit == 10) {
			System.out.print("X");
		} else {
			System.out.print(tenthdigit);
		}

	}

}
