
public class main {

	public static void main(String[] args) {
		
		
		isCatPlaying(true,10);
	}
public static boolean isCatPlaying(boolean summer, int temperature) {
		
		if (summer == true) {
			if (temperature > 25 && temperature <= 45) {
				return true;
			} else {
				return false;
			}
		} else if (summer == false) {
			if (temperature>25 && temperature <=35) {
				return true;
			} else {
				return false;
			}
		}
		return summer;
	}

}
