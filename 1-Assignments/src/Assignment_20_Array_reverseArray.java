import java.util.Arrays;

public class Assignment_20_Array_reverseArray {

	public static void main(String[] args) {
		
		int [] myIntArray = {1,2,3,4,5};
		
		System.out.println("Original array " + Arrays.toString(myIntArray));
		reverse(myIntArray);
		
		

	}

	private static void reverse(int[] myIntArray) {
		int left =0;
		int right = myIntArray.length-1;
		
		while (left < right) {
			int temp = myIntArray[left];
			myIntArray[left] = myIntArray[right];
			myIntArray[right] = temp;
			
			left ++;
			right --;
		}
		System.out.println("Reversed array "+Arrays.toString(myIntArray));
	}

}
