package edu.neumont.csc150.models;

import java.util.Random;


public abstract class Zombie {
	protected final Random random = new Random();
	private int arms = random.nextInt(0, 3);
	private int legs = random.nextInt(0, 3);
	private int baseHP;  // max health
	private int speed;   // How many feet-per-action a Zombie may move.

//region ================= GETTERS//SETTERS =================

	public int getArms() {
		return arms;
	}

	protected void setArms(int arms) {
		if (arms < 1 || arms > 2) {
			throw new IllegalArgumentException("Number of arms must be either 1 or 2.");
		}
		this.arms = arms;
	}

	public int getLegs() {
		return legs;
	}

	protected void setLegs(int legs) {
		if (legs < 1 || legs > 2) {
			throw new IllegalArgumentException("Number of legs must be either 1 or 2.");
		}
		this.legs = legs;
	}

	public int getBaseHP() {
		return baseHP;
	}

	protected void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}

	public int getSpeed() {
		return speed;
	}

	protected void setSpeed(int speed) {
		this.speed = speed;
	}

//endregion

	protected int roll(int numDice, int numOfSidesOnDie) {
		int sumOfDice = 0;

		for (int i = 0; i < numDice; i++) {
			sumOfDice += random.nextInt(numOfSidesOnDie) + 1;
		}
		return sumOfDice;
	}

	protected abstract Attack attack(int attackRoll);

	@Override
	public String toString() {
		return "Arms \u2509 " + getArms() + " \u2502 " + "Legs \u2509 " + getLegs();
	}
}
