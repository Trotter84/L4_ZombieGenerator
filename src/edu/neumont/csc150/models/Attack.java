package edu.neumont.csc150.models;

public class Attack {
	private int damage;
	private AttackType attackType;

	public Attack(int damage, AttackType attackType) {
		setDamage(damage);
		setAttackType(attackType);
	}

//region ================= GETTERS//SETTERS =================

	public int getDamage() {
		return damage;
	}

	private void setDamage(int damage) {
		if (damage < 0) {
			this.damage = 0;
		} else {
			this.damage = damage;
		}
	}

	public AttackType getAttackType() {
		return attackType;
	}

	private void setAttackType(AttackType attackType) {
		this.attackType = attackType;
	}

//endregion

	@Override
	public String toString() {
		return "Attack Type: " + getAttackType() + " \u2502 " + "Attack Amount: " + getDamage();
	}
}
