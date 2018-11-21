
public class Assignment_14_WhileLoop_isPalindrome {

	public static void main(String[] args) {
			
				
		System.out.println(isPalindrome(-1221)); //- > should return true
		System.out.println(isPalindrome(707)); //- > should return true
		System.out.println(isPalindrome(11212)); //- > should return false because reverse is 21211 and that is not equal to 11212		
				
	}
	
	
	public static boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse=0;
		while (palindrome > 0) {
			int lastDigit=palindrome%10;
			reverse = reverse * 10 + lastDigit;
			palindrome = palindrome/10;
			
		}
		if (number == reverse) {
			return true;
		}
		return false;
		
	}

}
