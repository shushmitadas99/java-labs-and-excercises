
public class ExerciseOne {
	//Create a method named getPi that returns the value of pi.
	public static void main(String[] args) {
		//create a class instance
		ExerciseOne e1 = new ExerciseOne();
		
		//call getPi() method
		System.out.println("The value of pi is: " + e1.getPi());

	}
	
	//getPi method returns value of pi
	public double getPi() {
		double pi = Math.PI;
		return pi;
	}
	
	//Revature Solution:
	//public double getPi(){
	//	 return Math.PI;
	//	}

}
