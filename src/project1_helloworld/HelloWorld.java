package project1_helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("first number: ");
		int firstNumber = sc.nextInt();
		System.out.println("second number: ");
		int secNumber = sc.nextInt();

		System.out.println("Min = " + Math.min(firstNumber, secNumber));
		sc.close();
	}
}
