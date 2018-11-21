import java.util.*;


public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice=0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit=true;
				break;
			}
		}

	}

	

	private static void searchForItem() {
		// TODO Auto-generated method stub
		
	}



	private static void removeItem() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyItem() {
		// TODO Auto-generated method stub
		
	}

	private static void addItem() {
		// TODO Auto-generated method stub
		
	}

	private static void printInstructions() {
		System.out.println("Enter 1: For grocerylist. 2: To add an item. 3: To Modify item. 4: To remove item. 5: To search for item. 6: To quit.");
	}

}
