
public class ExerciseTwo {

	public static void main(String[] args) {
		// prints the letters of the alphabet on the same line
		char letter = 'a';
		char end = 'z';
		
		do {
			System.out.print(letter + " ");
			letter++;
		}while(letter <= end);
	}

}
