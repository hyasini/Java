
public class Assignment_13_ForLoop_IsOdd {

	public static void main(String[] args) {
		
		
		System.out.println(sumOdd(1,100)); // should print 2500
		System.out.println(sumOdd(-1,100)); // should print -1
		System.out.println(sumOdd(100,100)); // should print 0
		System.out.println(sumOdd(100,-100)); // should print -1
		System.out.println(sumOdd(100,1000)); // should print 247500

	}
	public static boolean isOdd (int number) {
		
		if (number<0) {
			return false;
		} else if (number%2 !=0){
			return true;
		} else {
			return false;
		}
	}
	
	public static int sumOdd(int start, int end) {
		int sum=0;
		if (start > end || start < 0 || end < 0) {
			System.out.println("-1");
			
		} else {
			
			for (int i=start; i<=end; i++ ) {
				
				if (isOdd(i)) {
					sum+=i;
			}
				
			}
		}
		return sum;
	}
}
