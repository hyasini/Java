
public class Main {

	public static void main(String[] args) {
		//DeskPhone mikePhone = new DeskPhone (22222222,true);
		
		ITelephone mikePhone = new DeskPhone (222222222, true);
		mikePhone.powerOn();
		mikePhone.callPhone(222222222);
		mikePhone.isRinging();
		mikePhone.answer();
	}

}
