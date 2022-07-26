
public class MathematicalOperators {

	public static void main(String[] args) {
		//define variables
		int x = 5;
		int y = 3;
		int z;


		//simple addition
		z = x + y;
		System.out.println(z);

		//simple subtraction
		z = x - y;
		System.out.println(z);

		//simple multiplication
		z = x * y;
		System.out.println(z);

		//simple division
		z = x / y;
		System.out.println(z); //output 1.6 rounded to 1

		//simple modulus
		z = x % y;
		System.out.println(z);

		//float vs. int
		float f = 3.6f;
		int i = 22;
		//int(or long) result = f + i; //gives error due to precision loss => add cast (int)
		//long result = (int)f + i;
		double result = f + i; //error gone as double supports precision of int + float result
		System.out.println(result);

	}

}
