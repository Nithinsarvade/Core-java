package project;

import java.io.*;

import java.util.*;

import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double tax=0.0;	
		System.out.println("Enter your CTC or Salary per annum: ");
		double salary=s.nextDouble();
		if((salary > 0) && (salary < 180000)){			
		tax=0.0;		
		}
		else if((salary >= 181001.0) && (salary <= 300000.0))		
		{			
		tax=salary*(0.1);		
		}		
		else if((salary >= 300001) && (salary <= 500000))		
		{			
		tax=salary*(0.2);		
		}		
		else if((salary >=500001) && (salary <= 1000000))	
		{
					
		tax=salary*(0.3);
		}
		System.out.println("Income tax of"+tax+"should be paid for CTC of"+salary);
		
		
				
	}
	}
