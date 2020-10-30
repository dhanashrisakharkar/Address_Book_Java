package address_Book.com;

import java.io.FileNotFoundException;
import java.util.Scanner;

import edit_User.com.EditUser;
import DeleteUser.com.DeleteUser;
import Search_User.com.SearchUser;
import addUserDeiatls.com.AddUser;

public class Addressbook_Java {
	public static Scanner myObj = new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("*******************Welcome To Address Book Java**************");
		System.out.println("Enter no between 0-4");
		System.out.println("1)AddUser 2)EditUser 3)DeletUser 4)SearchUser");

		int option = myObj.nextInt();

		String f = null;
		switch (option) {
		case 1: // Add User Details
			AddUser j = new AddUser();
			break;

		case 2: // Edit User Details
			EditUser j1 = new EditUser();
			break;

		case 3: // Delete file
			DeleteUser j2 = new DeleteUser();
			break;

		case 4: // search file
			SearchUser j3 = new SearchUser();

			break;
		default:
			System.out.println("Give No in valid Range");
			break;
		}
	}
}
