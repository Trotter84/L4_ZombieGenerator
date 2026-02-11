package edu.neumont.csc150.models;

public class Tank extends Zombie {
	private int baseHP = random.nextInt(45, 71);
	private int speed = random.nextInt(4, 9);
	private int damageModifier = random.nextInt(10, 21);
	private Attack attack;

	public Tank() {
		setBaseHP(baseHP);
		setSpeed(speed);
		setDamageModifier(damageModifier);
	}

	//region ================= GETTERS//SETTERS =================

	public int getDamageModifier() {
		return damageModifier;
	}

	private void setDamageModifier(int damageModifier) {
		if (damageModifier < 10 || damageModifier > 20) {
			throw new IllegalArgumentException(getClass().getSimpleName() + " Damage Modifier must be between 10-20");
		}
		this.damageModifier = damageModifier;
	}

//endregion

	@Override
	protected Attack attack(int attackRoll) {
		if (attackRoll == 20) {
			return attack = new Attack((roll(3, 6) + getDamageModifier()) * 3, AttackType.CRIT);
		} else if (attackRoll >= 10 && attackRoll <= 19) {
			return attack = new Attack(roll(3, 6), AttackType.NORMAL);
		} else {
			return attack = new Attack(0, AttackType.MISS);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\t\u2524 " + super.toString() + " \u2502 " + "Base HP \u2509 " + getBaseHP() + " \u2502 " +
				"Speed \u2509 " + getSpeed() + " \u2502 " + "Damage Modifier \u2509 " + getDamageModifier() + " \u251C";
	}
}
