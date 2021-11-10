import java.util.Scanner;

public class IllegalBankTransactionException extends Throwable {
	public String toString() {
		return "IllegalBankTransactionException";
	}



}

public class InsufficientBalanceException extends Throwable {
	public String toString() {
		return "InsufficientBalanceException";
	}
	
public class SavingsAccount {

	public static void main(String[] args) throws IllegalBankTransactionException,InsufficientBalanceException  {
		// TODO Auto-generated method stub
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your deposit");
			double deposit = scanner.nextDouble();
			double balance = deposit;
			balance+=deposit;
			System.out.println("Enter your withdraw Amount");
			double withdraw = scanner.nextDouble();
			withdraw( withdraw,balance);}
			

		}

		private static void withdraw(double withdraw, double balance) throws IllegalBankTransactionException,InsufficientBalanceException {
			if(withdraw <= balance && withdraw >0) {
				System.out.println("Hi Take your amount "+ balance );
				
			}
			else if(withdraw <0) {
				throw new IllegalBankTransactionException();
				
			}
			else if(withdraw > balance || withdraw ==0) {
				throw new InsufficientBalanceException ();
				
			}
			
		}

	}

}
