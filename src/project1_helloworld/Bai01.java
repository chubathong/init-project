package project1_helloworld;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập tên: ");
		String ten = sc.nextLine();
		System.out.println("nhập điểm: ");
		String diem = sc.nextLine();

		System.out.println("Tên sinh viên: " + ten);
		System.out.println("Điểm: " + diem);
		sc.close();
	}
}
