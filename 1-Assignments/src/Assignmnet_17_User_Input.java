import java.util.*;

public class Assignmnet_17_User_Input {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int max=0; 
		int min=0;
		
		while (scanner.hasNextInt()) {
			int x=scanner.nextInt();
			if(x>max) {
				max=x;
			}else if(x<min) {
				min=x;
			}
			System.out.println("Enter number");
		}
			System.out.println("MAX number is equal "+max+" and MIN number is equal "+min);
			scanner.close();
		
		
	}




}
