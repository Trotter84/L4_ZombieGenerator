package edu.neumont.csc150.controllers;

import edu.neumont.csc150.models.Zombie;

import java.util.ArrayList;
import java.util.List;


public class ZombieGenerator {
	private List<Zombie> zombies = new ArrayList<>();

	public void run() {
	}

	private void generateOneZombie() {
		generateZombie();
	}

	private void generateSomeZombies(int qty) {
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

	private void printZombies() {
//		TODO: loop over zombies List, for each Zombie;
//		 call zombieRoll to generate and return attackAmount.
//		 call zombieAttck(int attackAmount) tell UI to printZombie(Zombie z,AttackType attackType, int attackAmount)
	}
}
