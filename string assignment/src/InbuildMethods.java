
public class InbuildMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java String pool refers to collections of Strings which are stored in heap memory";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.replace('a', '$'));
		System.out.println(s.indexOf("collections"));
		System.out.println(s.contains("collections"));
		System.out.println(s.indexOf("java string pool refers to collections of strings which are stored in heap memory"));
		System.out.println(s.contains("java string pool refers to collections of strings which are stored in heap memory"));
		System.out.println(s.equalsIgnoreCase("java string pool refers to collections of strings which are stored in heap memory"));
	}

}
