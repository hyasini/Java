
public class Main {

	public static void main(String[] args) {
		//charAt(index) : returns char value for the particular index
		String str = "JavaScript";
		System.out.println(str.charAt(3)); // a
		
		
		//length() : returns string length
		System.out.println(str.length()); //10
		
		//substring(int beginIndex): returns substring for given begining index
		System.out.println(str.substring(5)); //cript

		//substring(int beginIndex, int endIndex): returns substring for given begining index and end index
				System.out.println(str.substring(2,6)); //vaSc
				
		//contains() : returns true or false after matching the sequence of char value
				System.out.println(str.contains("va")); //true
		
		//equals(Object another) : checks the equality of string with the given object
				System.out.println(str.equals("JavaScript")); // true
				
		//isEmpty(): checks if string is empty
				System.out.println(str.isEmpty()); //false
				
		//concat(string str): concatenates the specified string
				System.out.println(str.concat(" batch9")); //JavaScript batch9
				
		//replace (char old, char new): replaces all occurences of the specified char value
				System.out.println(str.replace("Script", "Yasini")); //JavaYasini
				
		//equalsIgnoreCase(string another): compares another string. It does not check case
				System.out.println(str.equalsIgnoreCase("javascript"));// true
				
		//split(String delimeter): returns a split matching delimeter
				String str2 = "JavaScript is the best batch ever";
				String [] myArray = str2.split(" ");
				for (String word:myArray) {
					System.out.println(word);
				}
				
		//indexOf(): returns the specified char value index
				System.out.println(str.indexOf("v")); //2
				
		//indexOf(String substring, int fromIndex): returns the specified substing index starting with given 
				System.out.println(str.indexOf("a", 1)); //1
				
				
		//toLowerCase() : returns a string in lowercase
				System.out.println(str.toLowerCase());  //javascript
				
		//toUpperCase() : returns a string in uppercase
				System.out.println(str.toUpperCase());  //JAVASCRIPT
				
				
		//trim() : removes beginning and ending spaces of this string
				System.out.println(str2.trim());
						
				
	}

}
