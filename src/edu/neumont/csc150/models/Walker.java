package edu.neumont.csc150.models;

public class Walker extends Zombie {

    public Walker() {
        setBaseHP(random.nextInt(10, 23));
        setSpeed(random.nextInt(10, 23));
    }

    @Override
    public Attack attack(int attackRoll) {
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
        return getClass().getSimpleName() + "\t\u2524 " + super.toString() + " \u251C";
    }
}
