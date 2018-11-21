import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[10];
		myIntArray[0] =35;
		myIntArray[1] =30;
		
		int[] myIntArray2 = {1,20,30,4,5};
		
		
		System.out.println(myIntArray[1]+"|"+myIntArray2[3]);
		
		
		System.out.println("--------------");
	
			int[] myIntegers=getIntegers(5);
			getAverage(myIntegers);
			System.out.println("The average is " +getAverage(myIntegers));

	}
	
		//create a method -- getIntegers
	public static int[] getIntegers (int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter "+ number+" integer values");
		int[] values = new int[number];
		
		for (int i=0; i<values.length; i++) {
			values[i]=scanner.nextInt();
			}
		return values;
		
		
		
	}
	
	
	//method to get average
	
	public static double getAverage(int[] array) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return (double) sum/array.length;
		
		
	}
	
	

}
