
public class LinearSearch {

	public static void main(String[] args) {
		//create some dummy data for our method
		char letter = 'm';
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
				 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
//		char[] letters = null;  => edge case tester

		//call your methods here
		LinearSearch ls = new LinearSearch();
		
		System.out.println(ls.findIndex(letter, letters));
		
		//exercise one
		System.out.println(ls.findIndexBackwards(letter, letters));
		
		//exercise two
		System.out.println(ls.findLetterFromMiddle(letter, letters));
		 

	}
	
	//create your first method here
	public int findIndex(char target, char[] data) {
		
		if (data == null ) return -1;
		
		int result = -1;
		
		//loop through the data
		for (int i = 0; i < data.length; i++) {
			
			char temp = data[i];
			
			//test current element against target
			if (temp == target) {
				return i;
			}
		}

		return result;
	}
	
	//Exercise one
	public int findIndexBackwards(char target, char[] data) {
		if (data == null ) return -1;
		
		int result = -1;
		
		//loop through the data
		for (int i = data.length - 1; i > -1; i--) {
			
			char temp = data[i];
			
			//test current element against target
			if (temp == target) {
				return i;
			}
		}
		
		return result;
	}
	
	//Exercise two
	public int findLetterFromMiddle(char target, char[] data) {
		if (data == null)return -1;
		
		//split data in half
		char[] firstHalf = new char[data.length/2];
		char[] secondHalf = new char[data.length - data.length/2];

		//fill first array
		for (int i = 0; i < firstHalf.length; i++) {
			firstHalf[i] = data[i];
		}

		//fill second array
		for (int i = 0; i < secondHalf.length; i++) {
			secondHalf[i] = data[i + firstHalf.length];
		}

		//perform searching
		int result1 = findIndex(target, firstHalf);
		int result2 = findIndexBackwards(target, secondHalf);
		//compare results
		if (result1 > -1) 
			return result1;
		else if (result2 > -1)
			return result2 + firstHalf.length; //remember that secondHalf needs to add length/2 to return the correct index
		else
			return -1;
	} 
}
