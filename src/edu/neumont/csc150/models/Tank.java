package edu.neumont.csc150.models;

public class Tank extends Zombie {
	private int damageModifier = random.nextInt(10, 21);

	public Tank() {
		setBaseHP(random.nextInt(10, 23));
		setSpeed(random.nextInt(10, 23));
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
	public Attack attack(int attackRoll) {
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
		return getClass().getSimpleName() + "\t\u2524 " + super.toString() + " \u2502 " + "Damage Modifier \u2509 " + getDamageModifier() + " \u251C";
	}
}
