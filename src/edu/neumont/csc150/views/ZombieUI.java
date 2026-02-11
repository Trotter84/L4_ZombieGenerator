package edu.neumont.csc150.views;

public class ZombieUI {

	public int mainMenu() {
		return Console.getIntInput("""
										   1. Generate 1 Zombie
										   2. Generate 1-10 Zombies
										   3. Generate n Zombies
										   4. Exit""", Console.TextColor.BLUE
		);
	}

	public int promptForQuantity() {
		return Console.getIntInput("How many do you want to generate?", Console.TextColor.BLUE);
	}

	public String exitMessage() {
		return "exiting application...";
	}
}
