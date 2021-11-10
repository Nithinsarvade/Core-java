package project;

import java.util.Scanner;

public class TotalAndAverage {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a,b,c,total;
				
		double avg=0;
				
		System.out.println("Enter the marks of A subject: ");
				
		a=s.nextInt();
				
		System.out.println("Enter the marks of B subject: ");
				
		b=s.nextInt();
				
		System.out.println("Enter the marks of C subject: ");
				
		c=s.nextInt();
				
		total=a+b+c;
				
		avg=(total/3);
				
		System.out.println("Total marks scored is "+total+" and average is "+avg);
				
		
				
		
	}
	

}
