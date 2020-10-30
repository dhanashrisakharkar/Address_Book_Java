package edit_User.com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class EditUser {
	public static String Regex;
	public static Scanner sc;
	public static int j = 1;

	public static Scanner myObj = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the file name: ");
			String name = sc.nextLine();
			File myObj = new File(name);
			myObj.createNewFile();
			FileWriter fw = new FileWriter(myObj + AddName() + AddLastName() + Address() + City() + State() + ZipCode()
					+ PhoneNo());
			String Details = sc.nextLine();
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("first name is " + Details);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
