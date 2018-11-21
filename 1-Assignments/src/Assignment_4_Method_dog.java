
public class Assignment_4_Method_dog {

	public static void main(String[] args) {
	
		bark(true,1);
		bark(false,2);
		bark(true,8);
		bark(true,-1);

	}
	
	public static boolean bark(boolean barking, int hourOfDay){
       
        if (barking) {
        	if (hourOfDay<8 && hourOfDay>0 || hourOfDay>22) {
        		System.out.println(true);
        	} else {
        		System.out.println(false);
        	}
        } else if(!barking) {
        	System.out.println(false);
        	
        }
        return true;
}
}
