package project;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
        System.out.println("Enter a number:");  
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r,temp=n,sum=0;
        while(n>0)
        {
        r =n%10;
        n =n/10;
        sum=sum+(r*r*r);
        }
        if(temp==sum)
        	System.out.println("Its an Armstrong number ");
        else
        	System.out.println("Not an Armstrong number");
    		
		
	}

}
