
public class Main {

	public static void main(String[] args) {
		
		Engine e1 = new Engine(); // to pass engine argument from honda constructor in Honda class
		Honda h1= new Honda("Red", 200, e1);
		h1.carInfo(); //it will go to Honda class and then to Car class to find carInfo
		h1.startHonda();

	}

}
