package DeleteUser.com;

import java.io.File;
import java.util.Scanner;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String name = sc.nextLine();
		File myObj = new File(name);
		if (myObj.delete()) {
			System.out.println("Deleted the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}

	}

}
