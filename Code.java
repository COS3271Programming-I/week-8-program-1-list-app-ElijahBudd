package myProject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class List_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Create list
		List<Object> userList = new ArrayList<>();
		
		// Add to the list
		while (true) {
			System.out.print("What would you like to add to the list? (or 'end'): ");
			String listItem = userinput.nextLine();
			
			if (listItem.equals("end")) {
				break;
			}
			
			userList.add(listItem);
		}
		
		while (true) {
			System.out.println("Current List: " + userList);
			System.out.print("Type an option (add, remove, edit, end): ");
			String option = userinput.nextLine();
			
			// end program and print final list
			if (option.equals("end")) {
				System.out.println("Finalized List: " + userList);
				break;
			}
			
			// adds more to the list
			else if (option.equals("add")) {
				System.out.print("What would you like to add? ");
				String listAdd = userinput.nextLine();
				userList.add(listAdd);
			}
			
			// removes items from the list
			else if (option.equals("remove")) {
				System.out.print("Enter index number (0 - " + (userList.size() - 1) + "): ");
				int listRemove = Integer.parseInt(userinput.nextLine());
				if (listRemove >= 0 && listRemove < userList.size()) {
					userList.remove(listRemove);
				} else {
					System.out.println("Invalid index.");
				}
			}
			
			// remove an item and replace it
			else if (option.equals("edit")) {
				System.out.print("Enter the index to edit (0 - " + (userList.size() - 1) + "): ");
				int listEdit = Integer.parseInt(userinput.nextLine());
				if (listEdit >= 0 && listEdit < userList.size()) {
					System.out.print("What would you like to replace it with? ");
					String listReplace = userinput.nextLine();
					userList.set(listEdit,  listReplace);
					
				} else {
					System.out.println("Invalid index.");
				}
			}
		
			else {
				System.out.println("Invalid, try again.");
			}
		}
	}
}
