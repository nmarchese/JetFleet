package jets;

import java.util.Scanner;

public class FleetMenu {
	static Scanner userInput = new Scanner(System.in);
	static Fleet fleet;

	public static void main(String[] args) {
		fleet = new Fleet();
		int choice = 0;

		System.out.println("\n\nWELCOME TO YOUR FLEET MENU...\n\n");
		while (choice != 5) {
			displayMenu();
			choice = menuChoice();
			if (choice == 1) {
				fleet.printFleet();
				System.out.println("\n\n\nPress [0] to return to menu >>>  ");
				choice = menuChoice();
			} else if (choice == 2) {
				fleet.printMaxCruise(fleet.getFleet());
				System.out.println("\n\n\nPress [0] to return to menu >>>  ");
				choice = menuChoice();
			} else if (choice == 3) {
				fleet.printMaxRange(fleet.getFleet());
				System.out.println("\n\n\nPress [0] to return to menu >>>  ");
				choice = menuChoice();
			} else if (choice == 4) {
				addNewJet();
			} else if (choice == 5) {
				break;
			} else {
				System.out.println("\n\n    Invalid Selection \n\n    Please re-input >>>  ");
				menuChoice();
			}
		}

	}

	public static void displayMenu() {
		System.out.println("\n\n+-----------------------------------------+");
		System.out.println("|               Your Fleet                |");
		System.out.println("+-----------------------------------------+");
		System.out.println("|   [1]  List All Aircraft                |");
		System.out.println("|   [2]  Display Aircraft/Max Cruise      |");
		System.out.println("|   [3]  Display Aircraft/Max Range       |");
		System.out.println("|   [4]  Add New Aircraft                 |");
		System.out.println("|   [5]  Quit                             |");
		System.out.println("+-----------------------------------------+\n\n");
		System.out.print("    Enter a Selection  >>>  ");
	}

	public static int menuChoice() {
		int choice = userInput.nextInt();
		return choice;
	}

	public static void addNewJet() {
		Jet newJet = new Jet();
		System.out.println("    Enter New Aircraft Specifications:");
		System.out.print("    Make >>>  ");
		newJet.setMake(userInput.next());
		System.out.print("    Model >>>  ");
		userInput.nextLine();
		newJet.setModel(userInput.nextLine());
		System.out.print("    Range >>>  ");
		newJet.setMaxRange(userInput.nextDouble());
		System.out.print("    Cruise Speed >>>  ");
		newJet.setMaxCruiseSpeedMach(userInput.nextDouble());
		System.out.print("    Service Cieling >>>  ");
		newJet.setServiceCieling(userInput.nextDouble());
		System.out.print("    Takeoff Distance (0) for N/A >>>  ");
		newJet.setAvgTkoffDist(userInput.nextDouble());
		System.out.print("    Landing Distance (0) for N/A >>>  ");
		newJet.setAvgLndgDist(userInput.nextDouble());
		System.out.print("    Passenger Capacity >>>  ");
		newJet.setPassangerCapacity(userInput.nextInt());
		System.out.print("    Purchase Price (In Millions) >>>  ");
		newJet.setPrice(userInput.nextDouble());
		fleet.setFleet(newJet);
	}
}
