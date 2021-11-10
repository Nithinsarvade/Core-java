package project;

import java.util.Scanner;

public class valid {
	static int count = 0;

	public static void main(String[] args) {

		credentials();

	}

	public static void credentials() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your user id");
		String userID = s.next();
		System.out.println("Enter your Password");
		String password = s.next();
		login(userID, password);

	}

	public static void login(String userID, String password) {
		String userId = "Nithin";
		String password1 = "12345";
		if (userId.equals(userID) && password1.equals(password)) {
			System.out.println(userID + " your login is successful");
		} else {
			count++;
			if (count < 3) {
				credentials();
			} else {
				System.out.println("contact your Admin");
			}

		}

	}

}
