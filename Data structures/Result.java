package project;

public class Result {

	public static void main(String[] args) {
			int sub1=70,sub2=70,sub3=670;
			if(sub1>60 && sub2>60 && sub3>60) {
				System.out.println("passed");
			}
			else if((sub1>60 && sub2 >60) || (sub2>60 &&sub3>60) ||(sub1>60 &&sub3>60) ){ 
				System.out.println("Promoted");
				
			}
			else if((sub1>60 || sub2>60 || sub3>60) || (sub1<60 && sub2<60 && sub3<60)) {
				System.out.println("failed");

	}
	}
	}


