
public class calculateFeetAndInchestoCentimeters {

	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(156);
		calcFeetAndInchesToCentimeters(6, 0);
		calcFeetAndInchesToCentimeters(-10, 0);

	}
	
public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		
		if(feet<0 || (inches<0 || inches>12)) {
			System.out.println("Invalid feet or inches");
			return -1;
		}
		
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		
		System.out.println(feet +" feet, " + inches + "inches=" + centimeters + " centimeters" );
	
		
		return centimeters;
		
	}  
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches<0) {
			return -1;
		}
		
		double feet = (int)inches / 12 ;
		double remainingInches = (int)inches % 12;
		
		System.out.println(inches  + " inches=" + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
	
	
	
	

}

/*
 * Create a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
Feet is the first parameter, inches is the second parameter.
:black_small_square: You should validate that the first parameter feet is >=0, and second parameter inches is >=0 and <=12.
Return -1 from the method if either of the above is not true.
:black_small_square: If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this method
and return that value.
:black_small_square: Create a second method of the same name but with only one parameter inches is the parameter and validate it >=0,
return -1 if it is not true. But if it is valid, then calculate how many feet are in the inches.
:black_small_square: Call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.
:black_small_square: Hints : Use double for your number datatypes 1 inch = 2.54cm and 1 ft =12 inches
 * */
 

