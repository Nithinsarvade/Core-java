import java.util.Scanner;

public class Arithmeticexp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		try {
			int c=num/den;
			System.out.println("The output of divison is "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Do not provide the denominator value zero");
			
		}

	}

}
