
public class Assignment_1_Java {

	public static void main(String[] args) {
		/*
		 * Write a JAVA program to calculate the tax:

			income ≤ 150,000,000 tax ratio %25
			income ≤ 300,000,000 tax ratio %30
			income ≤ 600,000,000 tax ratio %35
			income ≤ 1,200,000,000 tax ratio %40
			income > 1,200,000,000 tax ratio %50
			
			Create needed variables and print the tax 
		 */
		
		int t1 = 150_000_000_0;
		
		if (t1 <= 150_000_000) {
			System.out.println("Total tax is " + (Math.round(t1*0.25)));
		} else if (t1 <= 350_000_000) {
			System.out.println("Total tax is " + (Math.round(t1*0.30)));
		} else if (t1 <= 600_000_000) {
			System.out.println("Total tax is " + (Math.round(t1*0.35)));
		} else if (t1 <= 1_250_000_000) {
			System.out.println("Total tax is " + (Math.round(t1*0.40)));
		} else if(t1 > 1_200_000_000) {
			System.out.println("Total tax is " + (Math.round(t1*0.50)));
		}
	}

}
