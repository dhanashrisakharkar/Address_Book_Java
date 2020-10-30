package addUserDeiatls.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AddUser {
	public static String Name;
	public static String LastName;
	public static String Address;
	public static String City;
	public static String State;
	public static int ZipCode;
	public static int PhoneNo;
	public static String Regex;
	public static Scanner sc;
	public static int j = 1;

	public static Scanner myObj = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
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
					System.out.println("Enter The mail Id " + "Email Id:-");
					String str8 = EmailId() + "\n";
					byte[] b1 = str1.getBytes();
					byte[] b2 = str2.getBytes();
					byte[] b3 = str3.getBytes();
					byte[] b4 = str4.getBytes();
					byte[] b5 = str5.getBytes();
					byte[] b6 = str6.getBytes();
					byte[] b7 = str7.getBytes();
					byte[] b8 = str8.getBytes();
					fos.write(b1);
					fos.write(b2);
					fos.write(b3);
					fos.write(b4);
					fos.write(b5);
					fos.write(b6);
					fos.write(b7);
					fos.write(b8);
					fos.close();
					System.out.println("file saved.");
					System.out.println("Details of Users \n" + "Name:-" + str1 + "\n" + "LastName:-" + str2 + "\n"
							+ "Address:-" + str3 + "\n" + "City:-" + str4 + "\n" + "State:-" + str5 + "\n"
							+ "Zipcode :-" + str6 + "\n" + "phoneno:-" + str7 + "\n" + "Email Id" + str8 + "\n");

				} else {
					System.out.println("File already exists.");
				}
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}

	}

	public static String AddName() {
		System.out.println("Enter the Name");
		String Name = myObj.nextLine();
		if (j >= 1) {
			Regex = "\\[A-Z]{1}[a-z]{3,}";
			System.out.println("Phone No Is Valid");
		} else {
			System.out.println("Not Valid");
		}
		return Name;
	}

	public static String AddLastName() {
		System.out.println("Enter the Last Nmame");
		String LastName = myObj.nextLine();
		if (j >= 1) {
			Regex = "\\[A-Z]{1}[a-z]{3,}";
			System.out.println("Phone No Is Valid");
		} else {
			System.out.println("Not Valid");
		}
		return LastName;
	}

	public static String Address() {
		System.out.println("Enter the Address");
		String Address = myObj.nextLine();
		if (j >= 1) {
			Regex = "\\[A-Z]{1}[a-z]{3,}";
			System.out.println("Phone No Is Valid");
		} else {
			System.out.println("Not Valid");
		}
		return Address;
	}

	public static String City() {
		System.out.println("Enter The City");
		String City = myObj.nextLine();
		if (j >= 1) {
			Regex = "\\[a-zA-Z]{3,}";
			System.out.println("Phone No Is Valid");
		} else {
			System.out.println("Not Valid");
		}
		return City;
	}

	public static String State() {
		System.out.println("Enter the State");
		String State = myObj.nextLine();
		if (j >= 1) {
			Regex = "\\[a-zA-Z]{3,}";
			System.out.println("Phone No Is Valid");
		} else {
			System.out.println("Not Valid");
		}
		return State;
	}

	public static int ZipCode() {
		System.out.println("Enter the ZipCode");
		int ZipCode = myObj.nextInt();
		if (j >= 1) {
			Regex = "\\[0-9]{6}";
			System.out.println("Phone No Is Valid");
		} else {
			System.out.println("Not Valid");
		}
		return ZipCode;
	}

	public static String PhoneNo() {
		System.out.println("Enter the phoneNo");
		String PhoneNo = myObj.next();
		if (j >= 1) {
			Regex = "\\d{10}";
			System.out.println("Phone No Is Valid");
		} else {
			System.out.println("Not Valid");
		}
		return PhoneNo;
	}

	public static String EmailId() {
		System.out.println("Enter the Email Id");
		String EmailId = myObj.next();

		while (j >= 1) {
			Regex = "\\^[a-zA-Z0-9]{3,}[@][a-z]{2,}[.][a-z]{2,3}";
			for (j = 0; j <= 5; j++) {
				if (Regex == "\\^[a-zA-Z0-9]{3,}[@][a-z]{2,}[.][a-z]{2,3}") {
					System.out.println("It is valid");
					return EmailId;
				}

			}

		}
		return null;

	}

}
