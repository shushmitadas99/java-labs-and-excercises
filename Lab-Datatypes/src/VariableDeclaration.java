

public class VariableDeclaration {

	public static void main(String[] args) {
		//boolean value
		boolean on = false;
		System.out.println(on);
		
		//character value
		char c = 'a';
		System.out.println(c);
		
		//number values
		byte b = 8;
		System.out.println(b);
		
		short s = 16;
		System.out.println(s);
		
		int i = -32;
		System.out.println(i);
		
		float f = 3839.34839f; //if f missing> gives compilation error coz double is expected as default
		System.out.println(f);
		
		long l = 4294967296L; //if l or L missing> 'The literal 4294967296 of type int is out of range' 
		System.out.println(l);
	}

}
