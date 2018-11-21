
public class Assignment_7_Method_HasTeen {

	public static void main(String[] args) {
		
				hasTeen(9,99,13); //= > true
				hasTeen(23,15,42); //= > true
				hasTeen(22,23,34); //= > false

	}
	
	public static boolean hasTeen(int a, int b, int c) {
		
		
		if ((a >= 13 && a <=19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		return true;
	}
	

}
