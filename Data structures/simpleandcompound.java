package project;

import java.util.Scanner;

public class simpleandcompound {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double principal, simple, ROI, time,compound;
		System.out.println("Enter principal amount:");
		principal = s.nextDouble();
		
		System.out.println("Enter ROI:");
		ROI=s.nextDouble();
		
		System.out.println("Enter time:");
		time=s.nextDouble();
		
		
		simple = (principal*ROI*time)/100;
		compound= principal*(Math.pow((1 + (ROI/100)),time));
		System.out.println("Simple Intrest is  :"+ simple +"compound intrest is :" +compound);
		
		

	}

}
