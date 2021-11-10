package project;

public class Amstrong {

	public static void main(String[] args) {
		 int k = 0,n=k,digit=0,sum=0;
	 for(int k1=100;k1<1000;k1++)
	 {
	 while(n!=0){
		 digit=n%10;
		 sum=sum+(digit*digit*digit);
		 n=n/10;
	 }
	 
	 if(k1==sum)
	 {
		 System.out.println(k1+ "is armstrong");
		 
	 }
	 
	 }

	}

}