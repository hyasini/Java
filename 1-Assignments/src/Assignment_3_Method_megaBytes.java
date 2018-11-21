
public class Assignment_3_Method_megaBytes {

	public static void main(String[] args) {
		
		megaBytesAndKiloBytes(2050);

	}
	
	public static void megaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid value");
		} else {
			int megaBytes = kiloBytes/1024;
			int remainingKiloBytes = kiloBytes % 1024;
			String result = kiloBytes +" KB"+ " = " + megaBytes +" MB" + " and " + remainingKiloBytes +" KB";
			System.out.println(result);
		}
	}

}
