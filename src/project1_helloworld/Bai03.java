package project1_helloworld;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập cạnh : ");
		int canh = sc.nextInt();

		System.out.println("the tich hin lap phuong: " + Math.pow(canh, 3));
		sc.close();
	}
}
