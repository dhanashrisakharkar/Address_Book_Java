package Search_User.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Enter the file name: ");
			String name1 = sc1.nextLine();
			File myObj1 = new File(name1);
			Scanner myReader = new Scanner(myObj1);
			System.out.println("File exixt");
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
