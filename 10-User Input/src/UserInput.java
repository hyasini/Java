import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a byte value");
		byte b1=scanner.nextByte();
		
		System.out.println("Enter a byte value");
		short s1=scanner.nextShort();
		
		System.out.println("Enter a byte value");
		int i1=scanner.nextInt();
		
		System.out.println("Enter a byte value");
		boolean bool=scanner.nextBoolean();
		
		
		
		
		
		System.out.println(b1+"|"+s1+"|"+i1+"|"+bool);
		
		scanner.nextLine();//this line is necessary to input string without this you will not be able to
							//input string after any other input
		
		System.out.println("Enter your name");
		String str =scanner.nextLine();
		System.out.println(str);
		
		scanner.close();  //it closes the object and saves memory. if you don't close it, it does not cause any problems
		
	}

}
