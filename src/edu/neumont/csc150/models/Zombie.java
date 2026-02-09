package edu.neumont.csc150.models;

import java.util.Random;


public abstract class Zombie {
	private final Random random = new Random();
	private final static int MIN_HP = 0;
	private static final int MIN_SPEED = 0;
	private int arms;
	private int legs;
	private int baseHP;
	private int speed;

//region ================= GETTERS//SETTERS =================

	public int getArms() {
		return arms;
	}

	private void setArms(int arms) {
		if (arms < 1 || arms > 2) {
			throw new IllegalArgumentException("Number of arms must be either 1 or 2.");
		}
		this.arms = arms;
	}

	public int getLegs() {
		return legs;
	}

	private void setLegs(int legs) {
		if (legs < 1 || legs > 2) {
			throw new IllegalArgumentException("Number of legs must be either 1 or 2.");
		}
		this.legs = legs;
	}

	public int getBaseHP() {
		return baseHP;
	}

	private void setBaseHP(int baseHP) {
		if (baseHP < MIN_HP) {
			this.baseHP = MIN_HP;
		} else {
			this.baseHP = baseHP;
		}
	}

	public int getSpeed() {
		return speed;
	}

	private void setSpeed(int speed) {
		if (speed < MIN_SPEED) {
			this.speed = MIN_SPEED;
		} else {
			this.speed = speed;
		}
	}

//endregion

	protected int roll(int numDice, int numOfSidesOnDie) {
		int sumOfDice = 0;

		for (int i = 0; i < numDice; i++) {
			sumOfDice += random.nextInt(numOfSidesOnDie) + 1;
		}
		return sumOfDice;
	}

	protected abstract int attack(int attackRoll);

	@Override
	public String toString() {
//		TODO: write toString for Zombie
		return null;
	}
}
