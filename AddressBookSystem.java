package Day9Assignment;

import java.util.Scanner;

public class AddressBookSystem {

	

	public void addContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		Object person;
		((Object) person).setFirstName(sc.next());
		System.out.println("Enter last name");
		person.setLastName(sc.next());
		System.out.println("Enter address");
		person.setAddress(sc.next());
		System.out.println("Enter city");
		person.setCity(sc.next());
		System.out.println("Enter state");
		person.setState(sc.next());
		System.out.println("Enter ZipCode");
		person.setZip(sc.nextInt());
		System.out.println("Enter phoneNumber");
		person.setPhoneNumber(sc.nextLong());
		System.out.println("Enter Email");
		person.setEmail(sc.next());
		System.out.println();
		System.out.println("Contact Add Successfully");

		System.out.println(person);
		System.out.println();

	}

	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name for Edit");
		String firstName = sc.next();
		if (firstName.equals(person.getFirstName())) {
			System.out.println("Edit Details of Person " + firstName);
			System.out.println("Enter first name");
			person.setFirstName(sc.next());
			System.out.println("Enter last name");
			person.setLastName(sc.next());
			System.out.println("Enter address");
			person.setAddress(sc.next());
			System.out.println("Enter city");
			person.setCity(sc.next());
			System.out.println("Enter state");
			person.setState(sc.next());
			System.out.println("Enter ZipCode");
			person.setZip(sc.nextInt());
			System.out.println("Enter phoneNumber");
			person.setPhoneNumber(sc.nextLong());
			System.out.println("Enter Email");
			person.setEmail(sc.next());
			System.out.println();
			System.out.println("Edit Contact Successfully");

			System.out.println(person);
			System.out.println();
		} else {
			System.out.println("Contact Not Found");
		}
	}

	public void deleteContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name For Delete Contact");
		String firstName = sc.next();
		if (firstName.equals(person.getFirstName())) {
			person = null;
			System.out.println("Contact Delete Successfully");
			System.out.println();
		} else {
			System.out.println("Contact Not Found");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook System!!!");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		while (true) {
			AddressBookSystem addressBook = new AddressBookSystem();
			System.out.println("Enter 1 For Add Contact");
			System.out.println("Enter 2 For Edit Contact");
			System.out.println("Enter 3 For Delete Contact");
			System.out.println("Enter 4 For Exit");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				addressBook.addContact();
			case 2:
				addressBook.editContact();
			case 3:
				addressBook.deleteContact();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}

}
