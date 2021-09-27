import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
			
			int a;
			int i;
			
			Scanner input = new Scanner (System.in);
			System.out.println("Input: ");
			a = input.nextInt();
			
			for (i=1; i <= 10; i++)
			{
				System.out.println (a + "x" + i + " = " + (i*a));
				
			}
			

	}

}
