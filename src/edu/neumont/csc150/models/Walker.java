package edu.neumont.csc150.models;

public class Walker extends Zombie {
	private int baseHP = random.nextInt(15, 31);
	private int speed = random.nextInt(6, 11);
	private Attack attack;

	public Walker() {
		setBaseHP(baseHP);
		setSpeed(speed);
	}

//region ================= GETTERS//SETTERS =================

//endregion

	@Override
	protected Attack attack(int attackRoll) {
		if (attackRoll == 20) {
			return attack = new Attack(roll(3, 6) * 2, AttackType.CRIT);
		} else if (attackRoll >= 8 && attackRoll <= 19) {
			return attack = new Attack(roll(3, 6), AttackType.NORMAL);
		} else {
			return attack = new Attack(0, AttackType.MISS);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\t\u2524 " + super.toString() + " \u2502 " + "Base HP \u2509 " + getBaseHP() + " \u2502 " +
				"Speed \u2509 " + getSpeed() + " \u251C";
	}
}
