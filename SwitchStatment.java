package javaPractice2021;

import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Choice = ");
		int choice = input.nextInt();

		switch (choice) {
		case 1: {
			System.out.print("R = ");
			int r = input.nextInt();
			System.out.println("Area of Square: " + r * r);
		}
			break;

		case 2: {
			System.out.print("L = ");
			int l = input.nextInt();
			System.out.print("B = ");
			int b = input.nextInt();
			System.out.println("Area of Rectangle: " + l * b);
		}

			break;
		default:
			break;
		}
	}
}
