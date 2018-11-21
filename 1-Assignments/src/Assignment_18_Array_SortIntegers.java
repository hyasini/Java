import java.util.*;


public class Assignment_18_Array_SortIntegers {

	public static void main(String[] args) {
		
		Integer [] myIntegers = getIntegers(5);
		sortIntegers(myIntegers);

		
	}


	private static void sortIntegers(Integer[] array) {
		Arrays.sort(array, Collections.reverseOrder());
		for (int i=0; i<array.length; i++) {
			
		}
		System.out.println("Decending order of Array "+ Arrays.toString(array));
		
	}

	private static Integer[] getIntegers(Integer number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter "+ number+" integer values");
		Integer[] values = new Integer[number];
		
		for (int i=0; i<values.length; i++) {
			values[i]=scanner.nextInt();
		}
		System.out.println("Numbers as they were entered " +Arrays.toString(values));
		
		return values;
		
	}
	

}
