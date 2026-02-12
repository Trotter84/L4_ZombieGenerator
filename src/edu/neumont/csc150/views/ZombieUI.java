package edu.neumont.csc150.views;

import edu.neumont.csc150.models.Attack;
import edu.neumont.csc150.models.Zombie;


public class ZombieUI {

	public int mainMenu() {
		return Console.getIntInput("""
										   1. Generate 1 Zombie
										   2. Generate 1-10 Zombies
										   3. Generate n Zombies
										   4. Exit""", 1, 4, Console.TextColor.YELLOW
		);
	}

	public int promptForQuantity() {
		return Console.getIntInput("How many do you want to generate?", 1, Integer.MAX_VALUE, Console.TextColor.YELLOW);
	}

	public void displayZombie(Zombie zombie, Attack attack) {
		Console.write(zombie + " ", Console.TextColor.PURPLE);
		Console.writeln("" + attack, Console.TextColor.CYAN);
	}

	public void exitMessage() {
		Console.writeln("exiting application...", Console.TextColor.GREEN);
	}
}
