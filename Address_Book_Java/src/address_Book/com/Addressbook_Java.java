package address_Book.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Addressbook_Java {
	public static String Name;
	public static String LastName;
	public static String Address;
	public static String City;
	public static String State;
	public static int ZipCode;
	public static int PhoneNo;
	public static int Regex;
	public static Scanner sc;

	public static Scanner myObj = new Scanner(System.in);

	static String AddName() {
		System.out.println("Enter the Name");
		String Name = myObj.nextLine();
		return Name;
	}

	static String AddLastName() {
		System.out.println("Enter the Last Nmame");
		String LastName = myObj.nextLine();
		return LastName;
	}

	static String Address() {
		System.out.println("Enter the Address");
		String Address = myObj.nextLine();
		return Address;
	}

	static String City() {
		System.out.println("Enter The City");
		String City = myObj.nextLine();
		return City;
	}

	static String State() {
		System.out.println("Enter the State");
		String State = myObj.nextLine();
		return State;
	}

	static int ZipCode() {
		System.out.println("Enter the ZipCode");
		int ZipCode = myObj.nextInt();
		return ZipCode;
	}

	static String PhoneNo() {
		int j = 1;
		System.out.println("Enter the phoneNo");
		String PhoneNo = myObj.next();
		if (j >= 1) {
			String regex = "\\d{10}"; // regex for 10 digits
			System.out.println("Phone No Is Valid");
		} else {
			System.out.println("Not Valid");
		}
		return PhoneNo;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("*******************Welcome To Address Book Java**************");
		int j = 1;
		System.out.println("Enter no between 0-4");
		System.out.println("1)AddUser 2)EditUser 3)DeletUser 4)SearchUser");

		int option = myObj.nextInt();

		String f = null;
		switch (option) {
		case 1: // Add User Details
			System.out.println("Enter the no of User Between 1 to 5");
			int User = myObj.nextInt();
			while (j <= User) {
				try {
					@SuppressWarnings("resource")
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter the file name: ");
					String name = sc.nextLine();
					File myObj = new File(name);
					if (myObj.createNewFile()) {
						System.out.println("File created: " + myObj.getName());
						FileOutputStream fos = new FileOutputStream(myObj, true);
						System.out.print("Enter file content: \n AddName:-");
						String str1 = AddName() + "\n";

						System.out.println("Enter the LastName LastName:-");
						String str2 = AddLastName() + "\n";
						System.out.println("Enter the Address" + "Address:-");
						String str3 = Address() + "\n";
						System.out.println("Enter the City" + "City:-");
						String str4 = City() + "\n";
						System.out.println("Enter the state" + "State:-");
						String str5 = State() + "\n";
						System.out.println("Enter the ZipCode" + "Zipcode :-");
						String str6 = ZipCode() + "\n";
						System.out.println("Enter The Phone No " + "phoneno:-");
						String str7 = PhoneNo() + "\n";
						byte[] b1 = str1.getBytes();
						byte[] b2 = str2.getBytes();
						byte[] b3 = str3.getBytes();
						byte[] b4 = str4.getBytes();
						byte[] b5 = str5.getBytes();
						byte[] b6 = str6.getBytes();
						byte[] b7 = str7.getBytes();
						fos.write(b1);
						fos.write(b2);
						fos.write(b3);
						fos.write(b4);
						fos.write(b5);
						fos.write(b6);
						fos.write(b7);
						fos.close();
						System.out.println("file saved.");
						System.out.println("Details of Users \n" + "Name:-" + str1 + "\n" + "LastName:-" + str2 + "\n"
								+ "Address:-" + str3 + "\n" + "City:-" + str4 + "\n" + "State:-" + str5 + "\n"
								+ "Zipcode :-" + str6 + "\n" + "phoneno:-" + str7 + "\n");

					} else {
						System.out.println("File already exists.");
					}
				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}

		case 2: // Edit User Details
			try {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the file name: ");
				String name = sc.nextLine();
				File myObj = new File(name);
				myObj.createNewFile();
				FileWriter fw = new FileWriter(myObj + AddName());
				String name1 = sc.nextLine();
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("first name is " + name1);
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			break;
		case 3: // Delete file
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
			break;

		case 4: // search file
			try {
				@SuppressWarnings("resource")
				Scanner sc1 = new Scanner(System.in);
				System.out.print("Enter the file name: ");
				String name1 = sc1.nextLine();
				File myObj1 = new File(name1);
				Scanner myReader = new Scanner(myObj1);
				if (myObj1 != null) {
					System.out.println("File exixt");
				} else {
					System.out.println("file does not exist");
				}
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

			break;
		default:
			break;
		}
	}
}
