import java.util.Scanner;

public class DivideTwoNumbers {

	public static void main(String[] args) {
		
		int a,b,result;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Number one: ");
		a = input.nextInt();
		System.out.print("Number two: ");
		b = input.nextInt();
		
		result = a / b;
		System.out.println("Result: " + a / b);

	}

}
