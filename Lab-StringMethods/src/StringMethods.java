
public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.equals("Hello")); //same as == operator
		
		String s = new String("Hello");
		System.out.println(str == s); //false - 2 different objects
		System.out.println(str.equals(s));
		
		//When comparing values of objects (Strings are objects), always use .equals()
		
		//use the length() method
		System.out.println(str.length());
		
		//use the indexOf() method
		System.out.println(str.indexOf('H')); //returns -1 if char not in string
		
		//Independent practice
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(1));
		System.out.println(str.equalsIgnoreCase("hello"));
		System.out.println(str.substring(2));
		
	}

}
