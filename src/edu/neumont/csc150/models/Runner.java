package edu.neumont.csc150.models;

public class Runner extends Zombie {
	private int baseHP;
	private int speed;
	private int climbSpeed;

	public Runner() {
		super();
	}

//region ================= GETTERS//SETTERS =================
//TODO: write getters and setters
//endregion

	@Override
	protected int attack(int attackRoll) {
//		TODO: finish method
		return 0;
	}

	@Override
	public String toString() {
//		TODO: write toString for Runner
		return super.toString();
	}
}
