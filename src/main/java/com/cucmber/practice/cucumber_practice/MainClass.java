package com.cucmber.practice.cucumber_practice;

public class MainClass {

	public static void main(String[] args) {
		// String array containing 13 roman symbols

		String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		// int array containing 13 decimal numbers

		int[] decimals = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		
		int inputNumber = 14;

		// Copying inputNumber into copyOfInputNumber

		int copyOfInputNumber = inputNumber;

		// Initializing 'roman' to empty string

		String roman = "";

		// Generating roman equivalent of inputNumber

		// See the below explanation to see how it works

		if (inputNumber >= 1 && inputNumber <= 3999) {
			for (int i = 0; i < 13; i++) {
				while (inputNumber >= decimals[i]) {
					inputNumber = inputNumber - decimals[i];

					roman = roman + romanSymbols[i];
				}
			}

			System.out.println("Roman Equivalent Of " + copyOfInputNumber + " is : " + roman);
		} else {
			System.out.println("Invalid Number");
		}
	}

}
