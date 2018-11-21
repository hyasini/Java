
public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Abc.show1(); //static method could be called just by class name
		Abc.show4();
		
		Abc x= new Abc(); //instance method could only be called throug creating object
		x.show2();
		x.show3();
		
	}

}

class Abc {
	public static void show1() {
		System.out.println("hi");
		//show2(); static methods can not call instance methods but it works the other way around
		show4();
	}
	public void show2() {
		System.out.println("hi");
		show4();
	}
	public void show3() {
		System.out.println("hi");
		show2();
	}
	public static void show4() {
		System.out.println("hi");
	}
}
