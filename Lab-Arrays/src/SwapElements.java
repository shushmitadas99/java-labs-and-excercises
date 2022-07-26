
public class SwapElements {

	public static void main(String[] args) {
		int[] elements = {1, 2, 3, 4, 5};
	    /*Put your code here to swap the first element with the last*/
		//Initial Array - Printing first and last elements
		System.out.println("Initial array first element: " + elements[0]);
		System.out.println("Initial array last element: " + elements[4]);
		
		//Swapping first and last element
		int temp = elements[0];
		elements[0] = elements[4];
		elements[4] = temp;
		
		//Modified Array - Printing first and last elements
		System.out.println("\nModified array first element: " + elements[0]);
		System.out.println("Modified array last element: " + elements[4]);
	}

}
