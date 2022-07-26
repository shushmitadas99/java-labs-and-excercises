
public class StringConcatenation {

	public static void main(String[] args) {
		String beginning = "Hello";
		String end = " World";
		String combo = beginning + end;
		
		System.out.println(combo);
		
		long l = 203L;
		System.out.println("The value of l: " + l);
		
		boolean b = true;
		System.out.println(b + " is true");
		
		//Order Matters
		int x = 2;
		int y = 3;
		System.out.println("Wrong: The sum of x and y is " + x + y); //2 + 3 = 23
		System.out.println("Right: The sum of x and y is " + (x + y)); //parenthesis tells to compute x + y first.
		System.out.println(x + y + " is the sum of x and y"); //switching order of operands
		
//		whatever is on the left-hand side of the + operator determines whether it will be a string concatenation or a sum
	}

}
