
public class Assignment_6_Method_HasEqualSum {

	public static void main(String[] args) {
		
				hasEqualSum(1,1,1); //= > false
				hasEqualSum(1,1,2); //= > true
				hasEqualSum(1,-1,0); //= > true
		
	}
	public static boolean hasEqualSum(int a, int b, int c) {
		
		if (a+b==c) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		return true;
	}
	

}
