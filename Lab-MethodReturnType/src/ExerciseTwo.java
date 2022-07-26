
public class ExerciseTwo {

	public static void main(String[] args) {
		//create a class instance
		ExerciseTwo e2 = new ExerciseTwo();
		
		//calling getAlphabetArray() method
		System.out.println(e2.getAlphabetArray());
		

	}
	
	public char[] getAlphabetArray() {
		 char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'
		, 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		 return letters;
	} 
}
