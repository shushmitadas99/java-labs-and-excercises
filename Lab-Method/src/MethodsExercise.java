
public class MethodsExercise {

	public static void main(String[] args) {
		MethodsExercise me = new MethodsExercise();
		
		int num = me.randomNumber();
		
		System.out.println(num); 

	}
	
	public int randomNumber() {
		 int result = (int) (Math.random() * 50) + 1;

		 return result;
		 } 


}
