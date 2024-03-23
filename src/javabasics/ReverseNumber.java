package javabasics;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int reverse = 0;
		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reversed number : " +reverse);
		sc.close();
	}
}
