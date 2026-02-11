package edu.neumont.csc150.controllers;

import edu.neumont.csc150.models.*;
import edu.neumont.csc150.views.ZombieUI;

import java.util.ArrayList;
import java.util.List;


public class ZombieGenerator {
	private List<Zombie> zombies = new ArrayList<>();
	private ZombieUI zombieUI;

	public ZombieGenerator() {
		zombieUI = new ZombieUI();
	}

	public void run() {
		mainMenuController();

		Zombie walker1 = new Walker();
		System.out.println(walker1);
		Zombie runner1 = new Runner();
		System.out.println(runner1);
		Zombie tank1 = new Tank();
		System.out.println(tank1);

		Zombie walker2 = new Walker();
		System.out.println(walker2);
		Zombie runner2 = new Runner();
		System.out.println(runner2);
		Zombie tank2 = new Tank();
		System.out.println(tank2);

	}

	public void mainMenuController() {

		do {
			int selection = zombieUI.mainMenu();
			switch (selection) {
				case 1 -> generateOneZombie();
				case 2 -> generateSomeZombies(zombieUI.promptForQuantity());
				case 3 -> generateNZombies(zombieUI.promptForQuantity());
				case 4 -> {
					return;
				}
			}
		} while (true);
	}

	private void generateOneZombie() {
		generateZombie();
	}

	private void generateSomeZombies(int qty) {
		if (qty < 1 || qty > 11) {
			throw new IllegalArgumentException("Enter a number between 1-10");
		}
		for (int i = 0; i < qty; i++) {
			generateZombie();
		}
	}

	private void generateNZombies(int qty) {
		for (int i = 0; i < qty; i++) {
			generateZombie();
		}
	}

	private void generateZombie() {
//		TODO: Create new zombie instance.
	}

	private void zombieAttack() {
//		TODO: zombie.attack(roll(1, 20));
	}

	private void printZombies() {
//		TODO: loop over zombies List, for each Zombie;
//		 call zombieRoll to generate and return attackAmount.
//		 call zombieAttck(int attackAmount) tell UI to printZombie(Zombie z,AttackType attackType, int attackAmount)
	}
}
