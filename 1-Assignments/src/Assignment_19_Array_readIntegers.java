import java.util.Arrays;
import java.util.Scanner;

public class Assignment_19_Array_readIntegers {

	public static void main(String[] args) {
		int [] readIntegers= count(5);
		
		findMin(readIntegers);

	}

	private static void findMin(int [] array) {
		int min = array[0];
		
		for (int i=0; i<array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Minimun value is: "+min);
		
	}

	public static int[] count (int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter "+ number+" integer values");
		int[] values = new int[number];
		
		for (int i=0; i<values.length; i++) {
			values[i]=scanner.nextInt();
			}
		System.out.println("Numbers as they were entered " +Arrays.toString(values));
		return values;
		
		
		
	}

}
