
public class Assignment_5_Method_leapYear {
	
	public static void main(String[] args) {
		
				isLeapYear(-1600); //= > false
				isLeapYear(1600);// = > true
				isLeapYear(2017); //= > false
				isLeapYear(2000); //= >true
		
	}
	
	public static boolean isLeapYear(int year) {
		
		if (year>=1 && year<9999) {
			if ((year %4 ==0) && (year % 100 !=0 ) || (year % 400==0)) {
				System.out.println(true);
			} else {
				System.out.println(false);
				}
			
		} else if (year<1 || year>9999){
			System.out.println(false);
		}
		return true;
	}

}
