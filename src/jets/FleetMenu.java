package jets;

import java.util.Scanner;

public class FleetMenu {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("WELCOME TO YOUR FLEET MENU...\n\n");
		displayMenu();
		mainMenuChoice();
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
		System.out.print("    Enter a Selection  >>>");
	}
	public static void mainMenuChoice() {
		int choice = userInput.nextInt();
		if (choice == 1) {
			
		}
	}
}
