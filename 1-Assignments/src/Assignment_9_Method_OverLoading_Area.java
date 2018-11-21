
public class Assignment_9_Method_OverLoading_Area {

	public static void main(String[] args) {
				area(5.0); //= > 78,53975
				area(-1); //= > -1
				area(5.0,4.0); //= > 20.0
				area(-1.0,4.0); //= > -1

	}
	
	public static double area (double radius) {
		double circleRadius=0;
		if (radius<0) {
			System.out.println("-1");
		} else {
			circleRadius = radius * radius * 3.14159;
			System.out.println(circleRadius);
			}
		return circleRadius;
	}
	
	public static double area (double x, double y) {
		double rectangle =0;
		if (x < 0 || y < 0) {
			System.out.println("-1");
		} else {
			rectangle =x*y;
			System.out.println(rectangle);
			
		}
		return rectangle;
	}
	

}
