
public class DataTypes {

	public static void main(String[] args) {
		//byte
		byte b1=25;
		byte b2=-128;
		byte b3=127;
		System.out.println(b1+"|"+b2+"|"+b3);
		//byte b4=128; this throws error because byte value is bigger than 127
		
		System.out.println("------------------");
		
		//short
		short s1 = 500;
		short s2 = -32768;
		short s3 = 32767;
		//short s4 = 32768;
		
		System.out.println(s1+"|"+s2+"|"+s3);
		
		
		//int
		int i1=-50000;
		int i2=100_000;
		int i3=50000;
		System.out.println(i1+"|"+i2+"|"+i3);
		
		
		
		//long
		long l1=100_000_000;   //underscore is used so the long numbers could be read easily
		long l2=21478399494031L;  //L or l is used at the end of number to declare that it is long
		System.out.println(l1+"|"+l2);
		
		System.out.println("__________________");
		
		//float: floating point types have double as default type
		float f1=5.2f;   // f is used at the end to declare double
		double d1=5.2;
		
		System.out.println(f1+"|"+d1);
		
		System.out.println("----------------------");
		
		
		
		

	}

}
