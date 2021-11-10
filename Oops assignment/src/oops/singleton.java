package oops;
public class singleton {

	public static void main(String[] args) {
		class SingleTone 
		{
			
			private static SingleTone single=new SingleTone();
			
			private SingleTone()
			{
				
			}
			
			public static SingleTone getInstance()
			{
				return single;
			}
			public void getInfo()
			{
				System.out.println("In Singleton class...!!!");
			}
		}}}

			
			




