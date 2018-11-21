
public class Assignment_10_Method_OverLoading_PrintYearsAndDays {

	public static void main(String[] args) {
		printYearsAndDays(525600); //= > "525600 min = 1 y and 0 d"
		printYearsAndDays(1051200); //= > "1051200 min = 2 y and 0 d"
		printYearsAndDays(561600); //= > "561600 min = 1 y and 25 d"

	}
	
	public static void printYearsAndDays(long minutes) {
		
		if (minutes < 0) {
			System.out.println("Invalid value");
		}else {
			
			int hours = (int)(minutes/60);
			int day = hours/24;
			day = day%365;
			int year = hours/(365*24);
			String y = Integer.toString(year);
			String d = Integer.toString(day);
			
			System.out.println(minutes +" minutes= "+ y +" Year "+ d+" days");
		}
		
	}

}
