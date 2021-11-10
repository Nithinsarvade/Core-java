package project;

import java.util.Scanner;

public class search {
	public static void main(String[] args) {
		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		System.out.println("enter the size of array");
		int size = s.nextInt();
		int[] array = new int[size];
		for(int i=0;i<=array.length-1;i++) {
			System.out.println("enter the "+ (i+1 )+ "th element in array");
			array[i]=s.nextInt();
		}
		for(int i=0;i<=array.length-1;i++) {
			if(num==array[i]) {
				count++;
			}
		}
			if(count==1) {
				System.out.println("the given element is present in the array");
			}
			else {
				System.out.println("there is no such element in the array");
			}
		
		

	}

}
