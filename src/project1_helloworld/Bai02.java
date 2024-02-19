package project1_helloworld;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập cạnh dài: ");
		int dai = sc.nextInt();
		System.out.println("nhập cạnh rộng: ");
		int rong = sc.nextInt();

		double chuvi = (dai + rong) * 2;
		double dientich = dai * rong;
		System.out.println("chu vi hcn: " + chuvi);
		System.out.println("dien tich hcn: " + dientich);
		System.out.println("canh nho nhat hcn: " + Math.min(dai, rong));
		sc.close();
	}
}
