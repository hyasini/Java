
public class assignment15_Loop {

	public static void main(String[] args) {
		
		sumFirstAndLastDigit(252); //should return 4, 
		sumFirstAndLastDigit(257); //should return 9, 
		sumFirstAndLastDigit(0); //should return 0, 
		sumFirstAndLastDigit(5); //should return 10, 
		sumFirstAndLastDigit(-10); //should return -1,

	}
		public static void sumFirstAndLastDigit(int number) {
			if (number<0) {
				System.out.println("-1");
			} else {
				System.out.println(firstDigit(number)+lastDigit(number));
			}
		}
		public static int firstDigit(int number) {
			while (number >= 10) {
				number =number / 10;
			}
			return number;
		
	}
	
		public static int lastDigit(int number) {
		
			return number % 10;
		
		}
	
	
	}


