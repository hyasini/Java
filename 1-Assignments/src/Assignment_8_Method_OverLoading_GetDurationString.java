
public class Assignment_8_Method_OverLoading_GetDurationString {

	public static void main(String[] args) {
		
		System.out.println(getDurationString(185, 78));
		System.out.println(getDurationString(224, 45));
		System.out.println(getDurationString(3986));
		System.out.println(getDurationString(-35));

	}
	
	public static String getDurationString (int mins, int sec){
	
		
		if ((mins < 0) || (sec < 0 || sec >59)) {
			return "Invalid Value";
		} else {
			int m = mins%60;
			int h = mins/60;
			String seconds = Integer.toString(sec);
			String minutes = Integer.toString(m);
			String hour = Integer.toString(h);
			return hour+" Hours " + minutes+ " Mins "+ seconds+" Secs";
		}
		
		}
	
	public static String getDurationString (int sec) {
		if (sec<0) {
			return "Invalid Value";
		} else {
			int s=sec%60;
			int m=sec/60;
			getDurationString(m,s);
			
			return getDurationString(m,s);
		}
		
	}
	

}
