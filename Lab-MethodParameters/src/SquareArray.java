
public class SquareArray {

	public static void main(String[] args) {
		
		//creating class instance
		SquareArray arr = new SquareArray();
		
		//Instantiating variables locally
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 6;
		
		//calling sqArray() method and assigning it to variable square[]
		int[] square = arr.sqArray(a, b, c, d);
		
		//printing array using for loop
		for(int i = 0; i < square.length; i++) {
			System.out.println(square[i]);
		}

	}
	
	//Method to find square of the arguments passed and return array
	public int[] sqArray(int a,int b,int c,int d) {
		
		int result[] = {a*a, b*b, c*c, d*d};
		return result;
	}

}
