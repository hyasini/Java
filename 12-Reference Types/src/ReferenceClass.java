import java.util.Arrays;

public class ReferenceClass {

	public static void main(String[] args) {

		int myIntValue=10;
		int anotherIntValue=myIntValue;
		
		anotherIntValue+=1;
		
		System.out.println("myIntValue: "+ myIntValue);
		System.out.println("anotherIntValue: "+ anotherIntValue);
		
		System.out.println("=================");
		
		int [] myIntArray=new int [5];
		int [] anotherArray=myIntArray;
		
		anotherArray[0]=1;
		
		System.out.println("myIntArray: "+ Arrays.toString(myIntArray));
		System.out.println("anotherArray:" + Arrays.toString(anotherArray));
		
	}

}
