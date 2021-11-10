import java.util.Scanner;

public class Arithmeticexception extends Throwable{

	public static void main(String[] args) throws Arithmeticexception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		if(den==0) {
			throw new Arithmeticexception(); 
		}
		int c=num/den;
		System.out.println(c);

	}

	}

